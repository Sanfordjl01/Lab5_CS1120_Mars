/************************************************
 * Class: CS II - 1120 - Thur - 2:30pm
 * Lab 5 - Mars Rover 2.0
 * Due 03/30/2017 - 11:59pm
 * **********************************************
 * Program Purpose: Simulates a rover on Mars.
 * Limited user inputs.
 * **********************************************
 */

package edu.wmich.cs1120.la5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * This class takes a text file and interprets the data within and sends it to the TerrainScanner.
 * 
 * @author : Jonathan Sanford
 * @author : Chad Hirsch
 */
public class MapCreatorFromTxt implements IMapCreator {

	TerrainScanner tScanner = new TerrainScanner();  // provides access to public TerrainScanner methods 
	private static final int SIZE = 10; // fixed size of Area

	/**
	 * This scanTerrain method take in the file name and the threshold from the GUI. 
	 * It also take the 2D array path and fills it so it may be used by the GUI and other classes to perform the 
	 * operations the GUI requires.
	 */
	public void scanTerrain(String fileName, int threshold) throws IOException {

		try
		{
			FileReader fr = new FileReader(fileName);
			BufferedReader reader = new BufferedReader(fr); 
		    
		    Area[][] tempTerrainBuilder = new Area[SIZE][SIZE];
		    
		    // scan text file and parse data into Area objects
		    for (int y = 0; y < SIZE; y++) {
		    	for (int x = 0; x < SIZE; x++) {
		    		
		    		// get line data from file
		    		String[] line = reader.readLine().split(" ");
		    		
		    		// convert string data to double
		    		double[] data = parseLineFromSource(line);
		    		
		    		// Set Area type based on data provided
		    		if (data[2] >= 0.5 || (data[2] < 0.5 && data[1] > threshold * 0.5)) {
		    			tempTerrainBuilder[y][x] = new HighArea(data[0], data[1], data[2]);
		    		}
		    		else {
		    			tempTerrainBuilder[y][x] = new LowArea(data[0], data[1], data[2]);
		    		}
		    		
		    	}
		    }
			
		    // close text file
		    reader.close();
		    fr.close();
		    
		    // sends terrain data to TerrainScanner class
		    tScanner.setTerrain(tempTerrainBuilder);
		    
		} 
		
		catch(IOException x) {
		    System.err.format("IOException: %s%n", x);
		    }
		
	}

	/**
	 * Uses the object TerrainScanner and method setTerrain() to 
	 * return the Scanner. 
	 */
	public TerrainScanner getScanner() {
		
		return tScanner;
	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		
		tScanner = scanner;
	}
	
	/**
	 * Converts incoming string data into double float representation.
	 * It is assumed data is safe coming in as source is known.
	 * 
	 * @param source pre-sorted string data representing energy/elevation/radiation
	 * @return an {@link Area}
	 */
	private double[] parseLineFromSource(String[] source) {
		
		double[] result;
		
	    result = new double[] { Double.parseDouble(source[0].trim()), 
	    		Double.parseDouble(source[1].trim()), Double.parseDouble(source[2].trim()) };
		
	    return result;
	}
}

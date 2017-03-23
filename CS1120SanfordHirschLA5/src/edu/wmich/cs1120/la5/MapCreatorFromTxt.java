/************************************************
 * @author : Jonathan Sanford
 * @author : Chad Hirsch
 * Class: CS II - 1120 - Thur - 2:30pm
 * Lab 5 - Mars Rover 2.0
 * Due 03/30/2017 - 11:59pm
 * **********************************************
 * Program Purpose: Simulates a rover on Mars.
 * Limited user inputs.
 * **********************************************
 * Class: XXXXXXXX
 * Purpose: XXXXXXXXXXXXX
 * **********************************************
 * 
 */

package edu.wmich.cs1120.la5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MapCreatorFromTxt implements IMapCreator {

	TerrainScanner tScanner = new TerrainScanner();
	private Area path[][] = new Area[10][10];
	private double [][] elevations = new double[SIZE][SIZE];
	private static final int SIZE = 10;

	/**
	 * This scanTerrain method take in the file name and the threshold from the GUI. 
	 * It also take the 2D array path and fills it so it may be used by the GUI and other classes to perform the 
	 * operations the GUI requires.
	 */
	public void scanTerrain(String fileName, int threshold) throws IOException {

		try
		{
			FileReader fr = new FileReader(fileName);
			//@SuppressWarnings("resource")
			BufferedReader reader = new BufferedReader(fr); 
/*		    String line = null;
		    String [] values=null;*/
		    
		    Area[][] tempTerrainBuilder = new Area[SIZE][SIZE];
		    
		    // scan text file and parse data into Area objects
		    for (int y = 0; y < SIZE; y++) {
		    	for (int x = 0; x < SIZE; x++) {
		    		
		    		String[] line = reader.readLine().split(" ");
		    		
		    		double[] data = parseLineFromSource(line);
		    		
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
		    
		    
		    
		    		/*for(int i=0;i<SIZE;i++)
		    		{
		    			for(int j=0;j<SIZE;j++)
		    			{
		    				
		    				
		    				
		    				
		    						if((line = reader.readLine())!=null)
		    			    		values = line.split(" ");
		    			    		Area a = new Area();
		    			    		a.setBasicEnergyCost(Double.valueOf(values[0]));
		    			    		a.setElevation(Double.valueOf(values[1]));
		    			    		a.setRadiation(Double.valueOf(values[2]));
		    			    		path[i][j] = a;
		    			}
		    		}*/
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
		//tScanner.setTerrain(path);
		return tScanner;
	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		tScanner = scanner;
	}
	
	public char[][] generateMap (int threshold){
		
		char[][]map = new char[SIZE][SIZE];
		
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++){
				map[i][j] = checkIfPassable(i, j, threshold) ?  ' ' : 'X' ;
				
			}
		}
		return map;
	}

	/**
	 * This method check a locations elevation and determines if it is possible 
	 * by the rover or not. 	
	 * @param row
	 * @param col
	 * @param threshold
	 * @return
	 */
	public boolean checkIfPassable(int row, int col, int threshold){
		return elevations[row][col] <= threshold;
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
	   // return new Area(result[0], result[1], result[2]);
		
	}
	
	
}

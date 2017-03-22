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
 */

package edu.wmich.cs1120.la5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MapCreatorFromTxt implements IMapCreator {

	TerrainScanner obj = new TerrainScanner();
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
			@SuppressWarnings("resource")
			BufferedReader reader = new BufferedReader(fr); 
		    String line = null;
		    String [] values=null;
		    
		    		for(int i=0;i<SIZE;i++)
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
		    		}
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
		obj.setTerrain(path);
		return obj;
	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		obj = scanner;
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

}

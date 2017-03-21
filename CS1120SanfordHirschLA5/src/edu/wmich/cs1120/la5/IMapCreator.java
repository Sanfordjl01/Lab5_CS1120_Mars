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

import java.io.IOException;

public interface IMapCreator {

	/**
	 * 
	 * @param fileName
	 * @param threshold
	 * @throws IOException
	 */
	void scanTerrain(String fileName, int threshold) throws IOException;
	
	/**
	 * 
	 * @return
	 */
	TerrainScanner getScanner();
	
	/**
	 * 
	 * @param scanner
	 */
	void setScanner(TerrainScanner scanner);
}

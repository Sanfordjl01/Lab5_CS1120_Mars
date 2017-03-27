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

import java.io.IOException;

/**
 *   This interface provides the framework of how a class should parse data from a 
 *   file and send data to the TerrainScanner
 *   
 * @author : Jonathan Sanford
 * @author : Chad Hirsch
 */
public interface IMapCreator {

	/**
	 * Loads file from path and parses data into a object class defined as an Area as a 
	 * 2D array. 
	 * @param fileName The file path to load.
	 * @param threshold Sets the limit of acceptable terrain elevation
	 * @throws IOException thrown if file is incorrect
	 */
	void scanTerrain(String fileName, int threshold) throws IOException;
	
	/**
	 * Provides a reference to TerrainScanner
	 * @return TerrainScanner object reference
	 */
	TerrainScanner getScanner();
	
	/**
	 * Provides a reference to TerrainScanner
	 * @param scanner  Reference to a TerrainScanner object.
	 */
	void setScanner(TerrainScanner scanner);
}

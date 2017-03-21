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

import java.util.ArrayList;

public interface IRover {

	/**
	 * 
	 * @return
	 */
	ArrayList<IArea> getPath();
	
	/**
	 * 
	 * @param path
	 */
	void setPath(ArrayList<IArea> path);
	/**
	 * 
	 */
	void analyzePath();
	
	/**
	 * 
	 * @return
	 */
	String getAnalysis();
	
	/**
	 * 
	 * @param analysis
	 */
	void setAnalysis(String analysis);
	
	/**
	 * 
	 * @return
	 */
	String toString();
}

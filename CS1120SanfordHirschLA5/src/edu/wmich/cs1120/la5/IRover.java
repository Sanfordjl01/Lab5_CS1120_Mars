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

import java.util.ArrayList;

/**
 * This interface provides the methods used for evaluating the path to be taken
 * per the information requested.
 * 
 * @author : Jonathan Sanford
 * @author : Chad Hirsch 
 */
public interface IRover {
	/**
	 * @return The List of areas traversed 
	 */
	ArrayList<IArea> getPath();
	
	/**
	 * 
	 * @param path Area list to be set
	 */
	void setPath(ArrayList<IArea> path);
	
	/**
	 * Evaluates the path
	 */
	void analyzePath();
	
	/**
	 * @return type of Analysis and result
	 */
	String getAnalysis();
	
	/**
	 * @param analysis done
	 */
	void setAnalysis(String analysis);
	
	/**
	 * @return name of analysis
	 */
	String toString();
}

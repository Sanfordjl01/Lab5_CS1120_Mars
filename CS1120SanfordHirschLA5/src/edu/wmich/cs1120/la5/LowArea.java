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

public class LowArea extends Area {
	/**
	 * IsLow is used to determine if a location is of low value and returns a boolean value
	 * of true or false to help the program make the correct choice. 
	 * @return
	 */
	public boolean IsLow(){
			
			if ((radiation<0.5) && (elevation>(threshold * 0.5))){
				return false;
			}
			else{
				return true; 
			}
		}

}

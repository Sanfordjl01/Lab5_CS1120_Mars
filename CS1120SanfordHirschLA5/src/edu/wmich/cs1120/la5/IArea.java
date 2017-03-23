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

public interface IArea {
	/**
	 * Getter for basicEnergyCost
	 * @return
	 */
	double getBasicEnergyCost();
	
	/**
	 * Setter for basicEnergyCost
	 * @param basicEnergyCost
	 */
	void setBasicEnergyCost(double basicEnergyCost);
	
	/**
	 * Getter for elevation
	 * @return
	 */
	double getElevation();
	
	/**
	 * Setter for elevation
	 * @param elevation
	 */
	void setElevation(double elevation);
	
	/**
	 * Getter for radiation.
	 * @return
	 */
	double getRadiation();
	
	/**
	 * Setter for radiation.
	 * @param radiation
	 */
	void setRadiation(double radiation);
	
	/**
	 * Calculates
	 * @return
	 */
	double calcConsumedEnergy();

}

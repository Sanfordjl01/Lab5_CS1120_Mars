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

/**
 * This interface provides the contract by which other classes
 * may use to define an area
 * 
 * @author : Jonathan Sanford
 * @author : Chad Hirsch
 */
public interface IArea {
	/**
	 * @return current basicEnergyCost
	 */
	double getBasicEnergyCost();
	
	/**
	 * @param basicEnergyCost basicEnergyCost to set
	 */
	void setBasicEnergyCost(double basicEnergyCost);
	
	/**
	 * @return current elevation
	 */
	double getElevation();
	
	/**
	 * @param elevation elevation to set
	 */
	void setElevation(double elevation);
	
	/**
	 * @return current radiation
	 */
	double getRadiation();
	
	/**
	 * @param radiation radiation to set
	 */
	void setRadiation(double radiation);
	
	/**
	 * Calculates consumed energy.  Expressed through {@link HighArea} and {@link LowArea}
	 * @return energy
	 */
	double calcConsumedEnergy();

}

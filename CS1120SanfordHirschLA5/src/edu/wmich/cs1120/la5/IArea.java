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
	double getBasicEnergyCost();
	void setBasicEnergyCost(double basicEnergyCost);
	double getElevation();
	void setElevation(double elevation);
	double getRadiation();
	void setRadiation(double radiation);
	double calcConsumedEnergy();

}

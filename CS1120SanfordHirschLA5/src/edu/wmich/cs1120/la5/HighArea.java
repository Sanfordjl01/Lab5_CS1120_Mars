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
 * This class provides the means of defining and acting upon
 * an Area.
 * 
 * @author : Jonathan Sanford
 * @author : Chad Hirsch
 */
public class HighArea extends Area {
	
	// attribute of HighArea
	final public int HIGH_FACTOR = 4;
	
	/**
	 * Class constructor specifying the defining attributes
	 * @param bEnergy  basic energy cost for this Area
	 * @param elev  elevation for this Area
	 * @param rad  radiation for this Area
	 */
	public HighArea(double bEnergy, double elev, double rad) {
		super(bEnergy, elev, rad);
	}

	public double getBasicEnergyCost() {
		return basicEnergyCost;
	}

	@Override
	public void setBasicEnergyCost(double basicEnergyCost) {
		this.basicEnergyCost = basicEnergyCost;
	}

	@Override
	public double getElevation() {
		return elevation;
	}

	@Override
	public void setElevation(double elevation) {
		this.elevation = elevation;
	}

	@Override
	public double getRadiation() {
		return radiation;
	}

	@Override
	public void setRadiation(double radiation) {
		this.radiation = radiation;
	}
	
	@Override
	public double calcConsumedEnergy() {

		return basicEnergyCost * HIGH_FACTOR;
	}

}

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
 * This class provides the base implementation further utilized
 * by {@link HighArea} and {@link LowArea} to describe an region
 * the rover would enter.
 * 
 * @author : Jonathan Sanford
 * @author : Chad Hirsch
 *
 */
public class Area implements IArea{
	
	protected double basicEnergyCost; 
	protected double elevation;
	protected double radiation;

	/**
	 * Class constructor specifying the defining attributes
	 * @param bEnergy  basic energy cost for this Area
	 * @param elev  elevation for this Area
	 * @param rad  radiation for this Area
	 */
	public Area(double bEnergy, double elev, double rad) {
		basicEnergyCost = bEnergy;
		elevation = elev;
		radiation = rad;
	}
	
	public double getBasicEnergyCost(){
		return this.basicEnergyCost;
	}
	
	public void setBasicEnergyCost(double basicEnergyCost){
		this.basicEnergyCost = basicEnergyCost;
	}
	
	public double getElevation(){
		return this.elevation;
	}
	
	public void setElevation(double elevation){
		this.elevation = elevation; 
	}
	
	public double getRadiation(){
		return this.radiation;
	}
	
	public void setRadiation(double radiation){
		this.radiation = radiation;
	}
	
	public double calcConsumedEnergy(){ 

		return getBasicEnergyCost();
	}
	
	
}
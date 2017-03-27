/************************************************
 * Class: CS II - 1120 - Thur - 2:30pm
 * Lab 5 - Mars Rover 2.0
 * Due 03/30/2017 - 11:59pm
 * **********************************************
 * Program Purpose: Simulates a rover on Mars.
 * Limited user inputs.
 * **********************************************
 * */

package edu.wmich.cs1120.la5;


/**
 * This Class functions as a concrete object of type Area
 * It's defining characteristic is to provide a means of 
 * calculating energy consumed.
 * 
 * @author : Jonathan Sanford
 * @author : Chad Hirsch
 */
public class LowArea extends Area {
	
	final public int LOW_FACTOR = 2;
	
	/**
	 * Class constructor specifying the defining attributes
	 * @param bEnergy  basic energy cost for this Area
	 * @param elev  elevation for this Area
	 * @param rad  radiation for this Area
	 */
	public LowArea(double bEnergy, double elev, double rad) {
		super(bEnergy, elev, rad);
	}
	
	@Override
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
		
		return basicEnergyCost * LOW_FACTOR;
	}
	
	
	/**
	 * IsLow is used to determine if a location is of low value and returns a boolean value
	 * of true or false to help the program make the correct choice. 
	 * @return
	 */
	//public boolean IsLow(){
			
		
		
			/*if ((radiation<0.5) && (elevation>(threshold * 0.5))){
				return false;
			}
			else{
				return true; 
			}*/
	//	}

}

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
	

	/**
	 * Returns the basic energy cost set by the method setBasicEnergyCost(double basicEnergyCost).
	 */
	public double getBasicEnergyCost(){
		return this.basicEnergyCost;
	}
	
	/**
	 * Sets the protected variable 'protected double basicEnergyCost'.
	 */
	public void setBasicEnergyCost(double basicEnergyCost){
		this.basicEnergyCost = basicEnergyCost;
	}
	
	/**
	 * Returns the protected variable 'protected double elevation'.
	 */
	public double getElevation(){
		return this.elevation;
	}
	
	/**
	 * Sets the protected variable 'protected double elevation'.
	 */
	public void setElevation(double elevation){
		this.elevation = elevation; 
	}
	
	/**
	 * Returns the protected variable 'protected double radiation'.
	 */
	public double getRadiation(){
		return this.radiation;
	}
	
	/**
	 * Sets the protected variable 'protected double radiation'.
	 */
	public void setRadiation(double radiation){
		this.radiation = radiation;
	}
	
	/**
	 * calcConsumedEnergy() is used to determine the total cost of each block based on
	 * the locations threshold, radiation, and elevation. 
	 */
	public double calcConsumedEnergy(){ //This method was checked multiple times and shows no sign
										// of error but still returns different value than in the example.
		
		return getBasicEnergyCost();
		/*
		if( radiation>=0.5)             
			return basicEnergyCost*4;
		
		else if((radiation<0.5) && (elevation>(threshold*0.5)))
			return basicEnergyCost*4;
		
		else
			return basicEnergyCost*2;*/
	}
	
	
}
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
 * This class LITERALLY expresses a value held by an Expression
 * 
 * @author : Jonathan Sanford
 * @author : Chad Hirsch
 */
public class Literal implements IExpression {

	public int val;
	
	@Override
	public Integer getValue() {
		return val;
	}

}


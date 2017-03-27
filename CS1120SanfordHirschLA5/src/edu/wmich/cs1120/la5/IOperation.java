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
 * This interface holds the method to be further defined
 * to act upon two Expressions
 * 
 * @author : Jonathan Sanford
 * @author : Chad Hirsch
 */
public interface IOperation {

	/**
	 * @param left Expression Integer
	 * @param right Expression Integer
	 * @return integer value dependent on implementation of method.
	 */
	Integer perform(IExpression left, IExpression right);
	
}

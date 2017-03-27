/************************************************\
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
 * This class subtracts two values determined by type expressed by 
 * the expressions passed. 
 * 
 * @author : Jonathan Sanford
 * @author : Chad Hirsch
 *
 */
public class Subtraction implements IOperation {

	@Override
	public Integer perform(IExpression left, IExpression right) {
		
		return left.getValue() - right.getValue();
	}

}

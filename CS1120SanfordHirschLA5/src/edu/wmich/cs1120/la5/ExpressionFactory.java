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
 * This class provides a method to evaluate an expression
 * and determines the action upon said expression. 
 * 
 * @author : Jonathan Sanford
 * @author : Chad Hirsch
 */
public class ExpressionFactory {
	
	/**
	 * 
	 * @param operator character defines what operation to use on values
	 * @param val1 integer value left
	 * @param val2 integer value right
	 * @return a completed expression
	 */
	public static IExpression getExpression(char operator, int val1, int val2) {
		
			BinaryExpression exp = new BinaryExpression();
			Literal lit1 = new Literal();
			lit1.val = val1;
			Literal lit2 = new Literal();
			lit2.val = val2;
			
			if(operator == '+')
			{
				Addition add = new Addition();
				exp.value = add.perform(lit1, lit2);
			}
			else if(operator == '-')
			{
				Subtraction sub = new Subtraction();
				exp.value = sub.perform(lit1, lit2);
			}
			
			return exp;
	}
}

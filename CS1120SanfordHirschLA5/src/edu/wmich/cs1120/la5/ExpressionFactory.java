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

public class ExpressionFactory {
	
	/**
	 * 
	 * @param operator
	 * @param val1
	 * @param val2
	 * @return
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

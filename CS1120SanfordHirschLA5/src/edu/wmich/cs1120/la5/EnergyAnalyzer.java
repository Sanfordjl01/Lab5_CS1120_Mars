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
 */

package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class EnergyAnalyzer implements IRover {

	ArrayList<IArea> path;
	double result;
	
	
	@Override
	public ArrayList<IArea> getPath() {

		return path;
	}

	@Override
	public void setPath(ArrayList<IArea> path) {
		this.path = path;
		
	}

	@Override
	public void analyzePath() {
		
		result = 0;
		for (int i = 0; i < path.size(); i++) {
			// TODO have Area implemented
			
			result += path.get(i).calcConsumedEnergy();
		}
		
	}

	@Override
	public String getAnalysis() {
		
		return "Total Energy: "+Double.toString(result);
	}

	@Override
	public void setAnalysis(String analysis) {
		
		result = Double.parseDouble(analysis);
		
	}

	public String toString() {
		return "Energy Analyzer";
	}
	
}
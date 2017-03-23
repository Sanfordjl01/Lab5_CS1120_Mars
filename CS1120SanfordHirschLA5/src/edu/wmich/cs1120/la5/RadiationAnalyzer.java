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

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover {
	
	ArrayList <IArea> list = new ArrayList<IArea>();
	Double result;
	@Override
	public ArrayList<IArea> getPath() {
		return list;
	}

	@Override
	public void setPath(ArrayList<IArea> path) {
		this.list = path;
		
	}

	@Override
	public void analyzePath() {
		double totalRad = 0;
		
		for(int i=0;i<list.size();i++)
		{
			totalRad+=list.get(i).getRadiation();
		}
		result = totalRad;
	}

	@Override
	public String getAnalysis() {

			return "Total Radiation: "+ result;
	}

	@Override
	public void setAnalysis(String analysis) {
		result = Double.parseDouble(analysis);
		
	}

}
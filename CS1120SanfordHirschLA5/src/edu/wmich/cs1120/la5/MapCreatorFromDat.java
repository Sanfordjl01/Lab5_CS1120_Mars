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

import java.io.IOException;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MapCreatorFromDat implements IMapCreator{

	TerrainScanner obj = new TerrainScanner();
	private IArea path[][] = new IArea[10][10];
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		
		DataInputStream data_in = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(fileName))));
		while(true) {
            try {
            	
            	for(int i=0;i<10;i++)
	    		{
	    			for(int j=0;j<10;j++)
	    			{
		            	Area area = new Area(4,5,6);
		            	int count=1;
		            	for(int k=0;k<3;k++)
		            	{
		            		
		            		double a = data_in.readDouble();
		            		if(count==1)
		            			area.basicEnergyCost = a;
		            		else if (count == 2)
		            			area.elevation = a;
		            		else if(count ==3)
		            			area.radiation = a;
		            		count++;
		            	}
		            	path[i][j]=area;
		            	char op = data_in.readChar();
		            	int val1 = data_in.readInt();
		            	int val2 = data_in.readInt();
		            	
		            	new ExpressionFactory();
						if(ExpressionFactory.getExpression(op, val1, val2).getValue()==-1)
							break;
	    			}
	    		}
            }
            
            catch(IOException ex) {
                break;
            }
        }
		data_in.close();
	}

	@Override
	public TerrainScanner getScanner() {
		obj.setTerrain(path);
		return obj;
	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		// TODO Auto-generated method stub
		obj = scanner;
	}
}
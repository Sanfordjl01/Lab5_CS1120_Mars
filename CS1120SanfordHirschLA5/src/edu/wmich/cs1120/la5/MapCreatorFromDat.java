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

import java.io.IOException;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * This class takes a binary file and interprets the data within and sends it to the TerrainScanner.
 * 
 * @author : Jonathan Sanford
 * @author : Chad Hirsch
 */
public class MapCreatorFromDat implements IMapCreator{

	TerrainScanner tScanner = new TerrainScanner();
	
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		
		IArea path[][] = new IArea[10][10];
		
		DataInputStream data_in = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(fileName))));
		
		while(true) {
			
            try {
            	
            	for(int i = 0; i < 10; i++)
	    		{
	    			for(int j = 0; j < 10; j++)
	    			{
	    				
	    				double[] data = new double[3];
	    				
		            	int count = 1;
		            	for(int k = 0; k < 3; k++)
		            	{
		            		double a = data_in.readDouble();
		            		data[count - 1] = a;
		            		count++;
		            	}
		            	
		            	if (data[2] >= 0.5 || (data[2] < 0.5 && data[1] > threshold * 0.5))
		            		path[i][j] = new HighArea(data[0], data[1], data[2]);
		            	else
		            		path[i][j] = new LowArea(data[0], data[1], data[2]);
		            	
		            	char op = data_in.readChar();
		            	int val1 = data_in.readInt();
		            	int val2 = data_in.readInt();
		            	
		            	new ExpressionFactory();
						if(ExpressionFactory.getExpression(op, val1, val2).getValue() == -1)
							break;
	    			}
	    		}
            	
            	tScanner.setTerrain(path);
            	
            }
            
            catch(IOException ex) {
                break;
            }
        }
		
		data_in.close();
	}

	@Override
	public TerrainScanner getScanner() {
		
		return tScanner;
	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		
		tScanner = scanner;
	}
}
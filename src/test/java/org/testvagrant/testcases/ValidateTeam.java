package org.testvagrant.testcases;

import java.io.IOException;

import org.json.JSONArray;
import org.testvagrant.utilities.LoadJsonFile;


public class ValidateTeam extends LoadJsonFile   {
	
	   
		public  void TC1() throws IOException
		{
	       
	                 String play=LoadJsonFile.handleJson(); 
	                 
	                 JSONArray ar = new JSONArray(play);
	                 
	                 int count = ar.length();
	                 //System.out.println(play);
	
				    int fplayers = 0; //counter to keep track of players

				    String country[] = new String[count];

			         for(int i=0;i<count;i++)
							{
								
								country[i] = ar.getJSONObject(i).get("country").toString();

					                    if(country[i].contentEquals("India"))
								{
									fplayers++;
								}
							}

					if(fplayers == 7)
							{
								System.out.println("Team contains only 4 foreign players");
							}
							
							else
							{
								System.out.println("Team contains more than 4 foreign players");
							} 
	       
	       
	    }
}

package org.testvagrant.testcases;

import java.io.IOException;

import org.json.JSONArray;
import org.testvagrant.utilities.LoadJsonFile;

public class ValidateRole extends LoadJsonFile
{

	public  void TC2() throws IOException
	{
       
                 String play=LoadJsonFile.handleJson(); 
                 
                 JSONArray ar = new JSONArray(play);
                 
                 int count = ar.length();
                 //System.out.println(play);

                 int wp =0;//counter to count number of Wicket keepers in team
                 
                 boolean w = false;

                 String Wick[] = new String[count];//Array of String to store player roles

                 for(int i=0;i<count;i++)
         		{		
         		
                    Wick[i] = ar.getJSONObject(i).get("role").toString();		

                    if(Wick[i].contentEquals("Wicket-keeper"))
         			{
         				w=true;
         				wp++;
         			}
         					
         		}
                 
               if(w)
         		{
         			System.out.println("Team Contains "  +  wp  + " Wicket Keeper");
         		}
         		
         		else
         		{
         			System.out.println("Team does not contains any Wicket Keeper");	
         		}
	}
}


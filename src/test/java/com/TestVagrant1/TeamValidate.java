package com.TestVagrant1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;


public class TeamValidate 
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		
		File f = new File("../TestVagrant1/RCB.json");
		FileReader fr = new FileReader(f);
		JSONTokener js = new JSONTokener(fr);
		JSONObject body = new JSONObject(js);
		
		JSONArray ar = body.getJSONArray("player");
		
		int count = ar.length();
		
		int fplayers = 0;
		
		String country[] = new String[count];
		
		for(int i=0;i<count;i++)
		{
			
			
			country[i] = ar.getJSONObject(i).get("country").toString();
			
			
			
			if(country[i].contentEquals("India"))
			{
				fplayers++;
			}
			
		}
	
}
	
}

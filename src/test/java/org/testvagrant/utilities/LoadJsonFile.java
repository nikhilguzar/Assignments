package org.testvagrant.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class LoadJsonFile 
{
 
public static String handleJson() throws FileNotFoundException
	
	{
	
		File f = new File("../TestVagrant1/src/test/java/org/testvagrant/resources/RCB.json");
		FileReader fr = new FileReader(f);
		JSONTokener js = new JSONTokener(fr);
		JSONObject body = new JSONObject(js);
		JSONArray ar = body.getJSONArray("player");
		return ar.toString();
		
		
	}
}

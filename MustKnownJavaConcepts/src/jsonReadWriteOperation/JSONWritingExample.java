package jsonReadWriteOperation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONWritingExample 
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		JSONObject jsonObject=new JSONObject();
		
		jsonObject.put("Name","Thor");
		jsonObject.put("Age",1500);
		JSONArray array=new JSONArray();
		array.add("God of Thunder");
		array.add("Strongest Avenger");
		jsonObject.put("Special Qualities", array);
		
		FileWriter writer=new FileWriter("thor.json");
		BufferedWriter bufferedWriter=new BufferedWriter(writer);
		bufferedWriter.write(jsonObject.toJSONString());
		bufferedWriter.close();
	}

}

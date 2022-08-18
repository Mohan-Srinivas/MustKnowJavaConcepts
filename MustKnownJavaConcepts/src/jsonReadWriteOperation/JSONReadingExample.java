package jsonReadWriteOperation;


import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReadingExample 
{
	public static void main(String[] args) throws IOException, ParseException 
	{
		// TODO Auto-generated method stub
		JSONParser jsonParser=new JSONParser();
		FileReader fileReader=new FileReader("thor.json");
		Object parsedObject=jsonParser.parse(fileReader);
		JSONObject jsonObject=(JSONObject) parsedObject;
		
		String Name=(String) jsonObject.get("Name");
		Long age=(Long) jsonObject.get("Age");
		System.out.println("Name is :"+Name);
		System.out.println("Age is :"+age);
		System.out.println("Special Qualities are :");
		JSONArray jsonArray=(JSONArray) jsonObject.get("Special Qualities");
		Iterator iterator=jsonArray.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}

}

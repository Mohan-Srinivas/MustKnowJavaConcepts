package FileReadingOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingBufferedReader 
{
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		String fileLoc="UsingBufferedWriter.txt";
		
		FileReader fileReader=new FileReader(fileLoc);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		String currentLine;
		while((currentLine=bufferedReader.readLine())!=null)
		{
			System.out.println(currentLine);
		}
			
		bufferedReader.close();
	}

}

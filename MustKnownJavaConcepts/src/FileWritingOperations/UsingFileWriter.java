package FileWritingOperations;

import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter 
{
	public static void main(String[] args) throws IOException
	{
		
		// TODO Auto-generated method stub
		String fileLoc="filewriter.txt";
		String text="Learning is very important!!!!";
		
		FileWriter writer=new FileWriter(fileLoc);
		writer.write(text);
		writer.close();
	}

}

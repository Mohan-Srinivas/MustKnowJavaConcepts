package FileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingBufferedWriter 
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		
		String fileLoc="UsingBufferedWriter.txt";
		String text="Thor love and thunder";
		
		FileWriter writer=new FileWriter(fileLoc);
		BufferedWriter bufferedWriter=new BufferedWriter(writer);
		bufferedWriter.write(text);
		bufferedWriter.close();
	}

}

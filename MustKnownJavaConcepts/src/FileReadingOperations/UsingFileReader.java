package FileReadingOperations;


import java.io.FileReader;
import java.io.IOException;

public class UsingFileReader 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		String fileLoc="UsingBufferedWriter.txt";
		
		FileReader reader=new FileReader(fileLoc);
		int i;
		while((i=reader.read())!=-1)
		{
			System.out.print((char)i);
		}
		
		reader.close();
	}

}

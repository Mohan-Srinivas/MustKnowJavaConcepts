package FileReadingOperations;

import java.io.FileInputStream;
import java.io.IOException;

public class UsingFileInpuStream 
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		String fileLoc="fileWriter.txt";
		
		FileInputStream fis=new FileInputStream(fileLoc);
		int i=0;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		fis.close();
	}

}

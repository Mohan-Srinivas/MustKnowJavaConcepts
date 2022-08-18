package FileReadingOperations;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading
{
	public static void usingFileReader() throws IOException
	{
		FileReader reader=new FileReader("filewriter.txt");
		
		int i=0;
		while((i=reader.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
	public static void usingFIS() throws IOException
	{
		FileInputStream fis=new FileInputStream("filewriter.txt");
		
		int i=0;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
	}
	public static void usingBufferedReader() throws IOException
	{
		FileReader reader=new FileReader("filewriter.txt");
		
		BufferedReader bufReader=new BufferedReader(reader);
		String currentLine;
		while((currentLine=bufReader.readLine())!=null)
		{
			System.out.println(currentLine);
		}
	}
	public static void main(String[] a) throws IOException
	{
		FileReading.usingBufferedReader();
	}

}

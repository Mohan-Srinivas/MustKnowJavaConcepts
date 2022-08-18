package FileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritings 
{
	public static void UsingWriter() throws IOException
	{
		String FileLoc="usingwrite.txt";
		String content ="abskksnkfskkfnnfsjknkhkhfsk";
		FileWriter writer=new FileWriter(FileLoc);
		writer.write(content);
		writer.close();
	}
	public static void UsingFOS() throws IOException
	{
		String FileLoc="usingfos.txt";
		String content ="abskksnkfskkfnnfsjknkhkhfsk";
		byte[] bytes=content.getBytes();
		
		FileOutputStream fos=new FileOutputStream(FileLoc);
		fos.write(bytes);
		fos.close();
		
	}
	public static void UsingBufferedWriter() throws IOException
	{
		String FileLoc="usingfos.txt";
		String content ="\nabskksnkfskkfnnfsjknkhkhfsk";
		
		FileWriter writer=new FileWriter(FileLoc);
		BufferedWriter bufferedWriter=new BufferedWriter(writer);
		bufferedWriter.append(content);;
		bufferedWriter.close();
	}
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		FileWritings.UsingBufferedWriter();
	}

}

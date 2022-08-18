package FileWritingOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPaths 
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		String fileLoc="UsingPath.txt";
		String content="Doctor Strange Multiverse of maddness";
		
		byte[] text=content.getBytes();
		Path path=Paths.get(fileLoc);
		Files.write(path, text);
	}

}

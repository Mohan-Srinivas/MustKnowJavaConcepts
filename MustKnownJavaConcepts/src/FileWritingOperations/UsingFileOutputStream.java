package FileWritingOperations;


import java.io.FileOutputStream;
import java.io.IOException;

public class UsingFileOutputStream 
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		String fileLoc="UsingFileOutPutStream.txt";
		String text="Thor love and thunder";
		FileOutputStream fos=new FileOutputStream(fileLoc);
		byte[] content=text.getBytes();
		fos.write(content);
		fos.close();
	}

}

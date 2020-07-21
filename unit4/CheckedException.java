import java.io.*;
public class CheckedException
{
	public static void main(String args[])
	{
		try{
		FileReader file=new FileReader("F:\\IETDAVV\\javaAssignment\\Demo.txt");
		BufferedReader fileInput=new BufferedReader(file);
			// to print first three lines of the file
			for(int count=0;count<3;count++)
			{System.out.println(fileInput.readLine());}
			fileInput.close();	
		}
			catch(IOException ioe)
			{ioe.printStackTrace();}	
	}
}
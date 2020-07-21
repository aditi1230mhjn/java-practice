import java.io.*;
public class IOWrite
{
	public static void main(String args[])throws Exception
	{
		FileOutputStream fos=new FileOutputStream("F:\\IETDAVV\\javaAssignment\\unit4\\Demo.txt");
		String s="This is File Output Data.";
		byte b[]=s.getBytes();
		fos.write(b);
		fos.close();
		System.out.println("Data entered successfully...");
	}
}
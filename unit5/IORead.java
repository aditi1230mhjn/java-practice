import java.io.*;
public class IORead
{	public static void main(String args[])throws Exception
	{
	FileInputStream fis=new FileInputStream("F:\\IETDAVV\\javaAssignment\\unit4\\Demo.txt");
	byte b[]=new byte[100];
	int n=fis.read(b);
		//for( byte temp:b)
		//{System.out.println(temp);}
		System.out.println(" Reading completed...");
	String s=new String(b);
	System.out.println(s);
	}
}
import java.io.*;
import java.util.*;
public class ListFolder
{	public static void main(String args[])
	{
	File f=new File("F:\\IETDAVV\\javaAssignment\\unit4");
	String[] s=f.list();
	if(f.isDirectory()==true)
	{for(String temp:s)
		System.out.print(s+"\n ");}
	else {System.out.print("Not a Folder...");}
}
}
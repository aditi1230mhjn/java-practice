import java.util.*;
public class Vector_Arraylist
{
	public static void main(String args[])
	{	ArrayList arr=new ArrayList();
		arr.add(5);
		arr.add("Assignment");
		Vector v=new Vector();
		v.add(0,arr);
		v.add(1,2);
		v.add(2,"Java");
		v.add(3,"Program");
		v.add(4,"2018");
		System.out.println("The Vector is"+v);
	}
}
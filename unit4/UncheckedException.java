import java.util.*;
public class UncheckedException
{
	public static void main(String args[])
	{	Scanner in=new Scanner(System.in);
		System.out.print("Enter an integer value:");
		int x=in.nextInt();
		int y=0;
		int z=x+y;
		System.out.println("Operations performed with Zero");
		System.out.println("Add:"+z);
		System.out.println("Subs:"+(x-y));
		System.out.println("multiply:"+(x*y));
		System.out.println("Divide:"+(x/y));
	}
}
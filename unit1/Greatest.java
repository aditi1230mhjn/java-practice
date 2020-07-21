//three nos. as inputs from command line arguments and find the greatest one
public class Greatest
{
	public static void main(String args[])
	{
		//Nos. are entered from command line
		int d=0;
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		if(a>b&&a>c)
			d=a;
		if(b>a&&b>c)
			d=b;
		if(c>a&&c>b)
			d=c;
		System.out.println("the greatest no.among "+a+","+b+","+c+" is:"+d);
	}
}
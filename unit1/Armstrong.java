//check whether the no. is armstrong or not
import java.util.Scanner;// for taking input from the user
import java.lang.Math;
public class Armstrong
{
	public static boolean check(int n)
	{	int rem=0; 
		int digit=0;
		int p=n;
		while(p!=0)
		{p=p/10;
		digit++;}
		System.out.println("the no.of digits: "+digit);
		int number=n;
		int num=n;
		double result=0;
		while(num>0)
		{
			rem=num%10;
			result=result+(Math.pow(rem,digit));
			num=num/10;
		}
		if(result==number)
		{
			System.out.println("ArmStrong");
			return true;
		}
		else 
		{
			System.out.println("non Armstrong");
			return false;
		}
	}
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the no to be checked as an ArmStrong Number:");
		int number=input.nextInt();
		System.out.println(check(number));	
	}
}
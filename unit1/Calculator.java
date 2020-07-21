;//to create a calculator using switch case
import java.util.Scanner;
public class Calculator
{
	public static void main(String args[])
	{
		int result=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first operand");
		int one=input.nextInt();
		System.out.println("Enter the second operand");
		int two=input.nextInt();	
		System.out.println("Choose the operation to be performed:");
		char operation=input.next().charAt(0);
		switch(operation)
		{
			case '+': System.out.println("Addition=");
					  result=one+two;
					  break;
			case '-': System.out.println("Substraction");
					  result=one-two;
					  break;
			case '*': System.out.println("Multiplication");
					  result=one*two;
					  break;
			case '/': System.out.println("Division");
					  result=one/two;
					  break;
			case '%': System.out.println("Remainder");
					  result=one%two;
					  break;
			default: System.out.println("Choose among + - * / % only");
		}
		System.out.println("Result="+result);
	}
}
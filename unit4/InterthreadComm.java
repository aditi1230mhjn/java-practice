import java.util.*;
public class InterthreadComm
{
	int amount=10000;
	synchronized void withdraw(int amount)
	{	System.out.println("Going to withdraw...");
		if(this.amount<amount)
		{	System.out.println("less balance\nPlease wait...");
			try{wait();}
			catch(Exception e)
			{e.printStackTrace();}}
		this.amount-=amount;
		System.out.println("withdrawal complete...");
	}
	synchronized void deposit(int amount)
	{	System.out.println("Going to deposit...");
		this.amount+=amount;
		System.out.println("deposition complete...");
		notify();
	}
	public static void main(String args[])
	{
		final InterthreadComm itc=new InterthreadComm();
		new Thread(){
					public void run(){
					itc.withdraw(1500);}}.start();
		new Thread(){
					public void run(){
					itc.deposit(2000);}}.start();
	}
}
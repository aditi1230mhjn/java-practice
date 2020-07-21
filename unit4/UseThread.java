class MyThreadOne implements Runnable
{	Thread t;
	MyThreadOne()
	{//create a new thread
	t=new Thread(this,"DemoThread");
	System.out.println("Implemented Thread "+t);
	}
	
	//the entry point for the second
	public void run()
	{
		try{
			for(int i=5;i>0;i--)
			{System.out.println("Run method "+i);
			Thread.sleep(5000);
			System.out.println("....");
			}
		}catch(InterruptedException e)
		{e.printStackTrace();}
		System.out.println("Exiting the run method");
	}
}
class UseThread
{	public static void main(String args[])
	{	//create a new the thread
		MyThreadOne mt=new MyThreadOne();
		mt.t.start(); //start the thread 
		
		try{
			for(int i=10;i>5;i--)
			{System.out.println("Main Thread "+i);
			Thread.sleep(5000);
			System.out.println("----");
			}
		}catch(InterruptedException e)
		{e.printStackTrace();}
		System.out.println("Exiting Main Thread");
	}
}
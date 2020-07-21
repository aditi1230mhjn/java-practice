class MyThread extends Thread
{	
	public static void main(String args[])
	{	Thread t=Thread.currentThread();
		//storing the main thread in a temporary variable t
		System.out.println("Current Thread in main:"+t);
	
		//change the name of current thread
		t.setName("MyThread");
		System.out.println("Thread after name change:"+t);
		
		try{
			for(int i=5;i>=1;i--)
			{System.out.println("\t"+i);
			System.out.println("\t...."); //before sleep called
			System.out.println("\tSleep Called...");
			Thread.sleep(1000);
			System.out.println("\tafter 10 seconds of sleep");
		   }	}
			catch(InterruptedException e)
			{e.printStackTrace();}

		//change the priority of the Thread
		t.setPriority(7);
		System.out.println("\tThread after priority change:"+t);
		
		//check whether alive
		System.out.println("\twhether it is alive "+t.isAlive());
		if(t.isAlive())
		{
			for(int i=3;i>0;i--)
			{System.out.println("\t"+i);}
		}
	}
}
package com.thursdaylabquestion2;

 class ThreadExample extends  Thread  {
    static String message[]= {"java","is","hot","aromatic","and","invigorating."};
    public ThreadExample(String id)
    {
    	super(id);
    }
    public void run()
    {
    	String name=getName();
    	for(int i=0;i<message.length;++i)
    	{
    		randomWait();
    		System.out.println(name+message[i]);
    	}
    }
   void randomWait() {
		try
		{
			Thread.sleep((long)(1000*Math.random()));
		}
		catch(InterruptedException e)
		{
			System.out.println("Interrupted");
		}
  
	}
   public class TestThreadExample {
	public static void main(String[] args) {
		ThreadExample thread1=new ThreadExample("Thread1:");
		ThreadExample thread2=new ThreadExample("Thread2:");
	thread1.start();
	thread2.start();
	boolean thread1IsAlive=true;
	boolean thread2IsAlive=true;
	do
	{
		if(thread1IsAlive && thread1.isAlive())
		{
			thread1IsAlive=false;
			System.out.println("Thread1 is dead");
		}
		if(thread2IsAlive && thread2.isAlive())
		{
			thread2IsAlive=false;
			System.out.println("Thread2 is dead");
		}
	}
	while(thread1IsAlive || thread2IsAlive);
	System.out.println("--------------------------");
	}

	}

}

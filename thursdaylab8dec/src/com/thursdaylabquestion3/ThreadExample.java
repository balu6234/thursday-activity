package com.thursdaylabquestion3;

 class ThreadExample extends Thread{
	public void run()
	{
		int n=0;
		System.out.println("Even numbers are:");
		for(int i=0;i<=10;i++)
		{
			if(n%2==0)
				   System.out.println(i);
		}
	}
}
	class OddThread extends Thread{
		public void run() {
			System.out.println("the odd numbers are:");
			for(int j=0;j<=10;j++)
			{
				if(j%2!=0)
				{
					System.out.println(j);
				}
			}
		}

 public static void main(String[] args)
 {
	 ThreadExample t1=new ThreadExample();
	 OddThread t2=new OddThread();
	 t1.start();
	 try {
		t1.sleep(100);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	 t2.start();

 }
 }



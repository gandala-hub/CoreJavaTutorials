package com.core.tutorial.multithread;

class Thread1 extends Thread {

	public void run() {
		   System.out.println("running thread name is:"+Thread.currentThread().getName());  
		   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread1 run1");
			
			  try { Thread.sleep(1000);
			  
			  } catch (Exception e) { System.out.println(e); }
			
		}
	}

}

class Thread2 extends Thread {

	public void run() {
		   System.out.println("running thread name is:"+Thread.currentThread().getName());  
		   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread2 run2");
			
			 try { Thread.sleep(1000);
			  
			 } catch (Exception e) { System.out.println(e); }
			
		}
	}

}

public class MultiThreadingDemo2 {

	public static void main(String Args[]) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();

		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);

		t1.start();
		 try {Thread.sleep(10);} catch (Exception e) { System.out.println(e);}
		t2.start();
//		try {Thread.sleep(10);} catch (Exception e) { System.out.println(e);}

//		try {t1.join();} catch (Exception e) { System.out.println(e);}
//		try {t2.join();} catch (Exception e) { System.out.println(e);}
		
		//System.out.println("In main Thread");
	}

}

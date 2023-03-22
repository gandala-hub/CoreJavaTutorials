package com.core.tutorial.multithread;

class Thread3 implements Runnable {

	public void run() {
		   System.out.println("running thread name is:"+Thread.currentThread().getName());  
		   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread3 run");
			
			  try { Thread.sleep(1000);
			  
			  } catch (Exception e) { System.out.println(e); }
			
		}
	}

}

class Thread4 implements Runnable {

	public void run() {
		   System.out.println("running thread name is:"+Thread.currentThread().getName());  
		   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread4 run");
			
			 try { Thread.sleep(1000);
			  
			 } catch (Exception e) { System.out.println(e); }
			
		}
	}

}


public class MultiThreadDemo3 {

	public static void main(String[] args) {
		Runnable r3 = new Thread3();
		Runnable r4 = new Thread4();
		
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r4);

		t3.setPriority(Thread.MAX_PRIORITY);
		t4.setPriority(Thread.NORM_PRIORITY);

		t3.start();
		try {Thread.sleep(10);} catch (Exception e) { System.out.println(e);}
		t4.start();
		
		try {Thread.sleep(50);} catch (Exception e) { System.out.println(e);}
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		   System.out.println("running thread name is:"+Thread.currentThread().getName());  
		   System.out.println("running thread priority is:"+Thread.currentThread().getPriority()); 
		   System.out.println("In Main Thread");
	}


}

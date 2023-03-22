/*
  	1. Extending the Thread class
	2. Implementing the Runnable Interface
 */


package com.core.tutorial.multithread;

public class MultiThreadingDemo1 extends Thread{
	
	public void run() {
		try {
			
			System.out.println("Thread \t" + Thread.currentThread().getId() + "  started");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		int n = 4; 
		for(int i=0;i<n;i++) {
		MultiThreadingDemo1 threadObj = new MultiThreadingDemo1();
		threadObj.start();
		}
		
	}

}


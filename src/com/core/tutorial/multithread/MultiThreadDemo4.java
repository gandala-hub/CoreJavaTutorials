package com.core.tutorial.multithread;

class SynchTest{
	int i;
	
	synchronized void increment() {
		i++;
	}
}


public class MultiThreadDemo4 {

	public static void main(String[] args) throws Exception{
		
		SynchTest st = new SynchTest();
		
		Thread t1 = new Thread( new Runnable() {
					public void run(){
						for (int i = 0; i < 1000; i++) {
							st.increment();
						}
					}
				});
	
		Thread t2 = new Thread( new Runnable() {
			public void run(){
				for (int i = 0; i < 1000; i++) {
					st.increment();
				}
			}
		});

		t1.start();
		t2.start();
		
		
		 t1.join(); 
		 t2.join();
		 
		System.out.println("Value : " + st.i);
	}

}

package com.core.tutorial.multithread;

class MyQueue{
	int item;
	boolean setItem = false;
	
	synchronized void put(int i) {
		
		while (setItem) {
			try {wait();} catch (Exception e) {}		
		}
		
		this.item = i;
		System.out.println("Pet :" +item );
		this.setItem = true;
		notify();
	}

	synchronized void get() {
			while (!setItem) {
			try {wait();} catch (Exception e) {}		
		}
		
		System.out.println("Get :" +item );
		this.setItem = false;
		notify();
	}
}


public class ProdConsDemo {

	public static void main(String[] args) {
		
		MyQueue mq = new MyQueue();
		
		Thread Producer = new Thread(new Runnable() {
			@Override
			public void run() {
				int i=0;
				//while(true) {
				for (int j = 0; j < 10; j++) {
					mq.put(i++);	
					try {Thread.sleep(500);} catch (Exception e) {}
				}
				
			}
		});
		
		
		Thread Consumer = new Thread(new Runnable() {
			@Override
			public void run() {
				//while(true) {
				for (int k = 0; k < 10; k++) {

					mq.get();	
					try {Thread.sleep(4000);} catch (Exception e) {}
				}
				
			}
		});		
		
		Producer.start();
		Consumer.start();
	}

}
package com.core.tutorial.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class LinkedListQueueDemo {
	public static void main(String args[]) {
		
		Queue<String> llM = new LinkedList<String>();
		
		llM.add("Java");
		llM.add("C");
		llM.add("C++");
		llM.add("Python");
		
		Iterator<String> itr = llM.iterator();
		
//		while(itr.hasNext()) {
//			
//			System.out.println(itr.next());
//			
//			
//		}
		
	while(itr.hasNext()) {
			
			System.out.print(itr.next()+ "\t");
			//System.out.println(llM.peek());
	
		}
	
		System.out.println(llM.poll());
		
		Iterator<String> itr1 = llM.iterator();
	while(itr1.hasNext()) {
			
			System.out.print(itr1.next()+ "\t");
			System.out.println(llM.peek());
	
		}
		
	}

}

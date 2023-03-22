/*
 * Queue has the following Implementation classes 
 * PriorityQueue
 * ArrayDeque
 * LinkedList
 * 
 * Common methods add(), peek(), poll(); 
 * 
 * 
 * 
boolean add(E element): This method inserts the specified element into this priority queue.
public remove(): This method removes a single instance of the specified element from this queue, if it is present
public poll(): This method retrieves and removes the head of this queue, or returns null if this queue is empty.
public peek(): This method retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
Iterator iterator(): Returns an iterator over the elements in this queue.
boolean contains(Object o): This method returns true if this queue contains the specified element
void clear(): This method is used to remove all of the contents of the priority queue.
boolean offer(E e): This method is used to insert a specific element into the priority queue.
int size(): The method is used to return the number of elements present in the set.
toArray(): This method is used to return an array containing all of the elements in this queue.
Comparator comparator(): The method is used to return the comparator that can be used to order the elements of the queue.
 */

package com.core.tutorial.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
	//PriorityQueue implementation
		
		PriorityQueue<String> pQ = new PriorityQueue<String>();
		
		pQ.add("Giri");
		pQ.add("Andala");
		pQ.add("Kiran");
		pQ.add("Saket");
		
		Iterator<String> itr = pQ.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
		System.out.println(" Poll Queue " );
		
		for(int i=0; i<=pQ.size(); i++) {
			System.out.println( pQ.poll());
			
		}
		
		Iterator<String> itr1 = pQ.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
			
		}
		System.out.println("Head Element : " + pQ.peek());
		
		
		
	}

}

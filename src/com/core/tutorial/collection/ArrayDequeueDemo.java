/*

ArrayDeque in Java provides a way to apply resizable-array in addition to the implementation of the Deque interface. 
It is also known as Array Double Ended Queue or Array Deck. 
This is a special kind of array that grows and allows users to add or remove an element from both the sides of the queue. 

Few important features of ArrayDeque are as follows:

Array deques have no capacity restrictions and they grow as necessary to support usage.
They are not thread-safe which means that in the absence of external synchronization, ArrayDeque does not support concurrent access by multiple threads.
Null elements are prohibited in the ArrayDeque.
ArrayDeque class is likely to be faster than Stack when used as a stack.
ArrayDeque class is likely to be faster than LinkedList when used as a queue.


Imp Methods:

add(Element e) : The method inserts particular element at the end of the deque.
addFirst(Element e) : The method inserts particular element at the start of the deque.
addLast(Element e) : The method inserts particular element at the end of the deque. It is similiar to add() method
clear() : The method removes all deque elements.
size() : The method returns the no. of elements in deque.
clone() : The method copies the deque.
contains(Obj) : The method checks whether a deque contains the element or not
Iterator() : The method returns an iterator over the deque.
descendingIterator() : The method returns a reverse order iterator over the deque
element() : The method returns element at the head of the deque
getFirst(): The method returns first element of the deque
getLast(): The method returns last element of the deque
isEmpty(): The method checks whether the deque is empty or not.
toArray(): The method returns array having the elements of deque.
offer(Element e) : The method inserts element at the end of deque.
offerFirst(Element e) : The method inserts element at the front of deque.
offerLast(Element e) : The method inserts element at the end of deque.
peek() : The method returns head element without removing it.
peekFirst() : The method returns first element without removing it.
peekLast() : The method returns last element without removing it.
poll() : The method returns head element and also removes it
pollFirst() : The method returns first element and also removes it
pollLast() : The method returns last element and also removes it
pop() : The method pops out an element for stack repesented by deque
push(Element e) : The method pushes an element onto stack repesented by deque
remove() : The method returns head element and also removes it
removeFirst() : The method returns first element and also removes it
removeLast() : The method returns last element and also removes it
removeFirstOccurrence(Obj) : The method removes the element where it first occur in the deque.
removeLastOccurrence(Obj) : The method removes the element where it last occur in the deque.



==>
The difference is that offer() will return false if it fails to insert the element on a size restricted Queue, whereas add() will throw an IllegalStateException 

 */

package com.core.tutorial.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeueDemo {

	public static void main(String[] args) {
		
		
		Deque<String> dQ= new ArrayDeque<String>();
		
		//dQ.add("Sunday");
		dQ.add("Monday");
		dQ.add("Tuesday");
		dQ.add("Wednesday");
		dQ.add("Thursday");
		dQ.add("Friday");
		//dQ.add("Saturday");
		
		Iterator<String> itr1 = dQ.iterator();
		
		while(itr1.hasNext()) {
			
			System.out.println(itr1.next());
		}
	
		dQ.addFirst("Sunday");
		dQ.addLast("Saturday");
		
		System.out.println("\nAfter AddFirst and AddLast");
		Iterator<String> itr2 = dQ.iterator();
		
		while(itr2.hasNext()) {
			
			System.out.println(itr2.next());
		}
			
	}

}

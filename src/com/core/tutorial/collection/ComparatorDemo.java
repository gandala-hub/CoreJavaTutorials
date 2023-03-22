package com.core.tutorial.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	
	public static void main(String Args[]) {
	
		Laptop2 l1 = new Laptop2("HP","2010",2199.99); 
		Laptop2 l2 = new Laptop2("Dell","2015",3199.99);
		Laptop2 l3 = new Laptop2("Apple","2020",8199.99);
		
	List<Laptop2> lst = new ArrayList<>();
	
	lst.add(l1);
	lst.add(l2);
	lst.add(l3);

	Comparator<Laptop2> comp =  new Comparator<Laptop2> ()
	{
		@Override
		public int compare(Laptop2 o1, Laptop2 o2) {
/*		if (o1.getPrice() > o2.getPrice()) 
			return 1;
			else
				return -1;
		}*/
			
		if (o1.getModel().compareTo(o2.getModel())>1) 
			return 1;
			else
				return -1;
		}
		
	};
	
	Collections.sort(lst, comp);
	
	for (Laptop2 ll : lst) 
		System.out.println(ll.getMake() + "\t" + ll.getModel() + "\t" + ll.getPrice());
	
	}
	
	
}

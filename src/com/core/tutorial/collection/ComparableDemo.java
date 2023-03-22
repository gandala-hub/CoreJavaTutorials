package com.core.tutorial.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
	
	public static void main(String Args[]) {
	
		Laptop l1 = new Laptop("HP","2010",2199.99); 
		Laptop l2 = new Laptop("Dell","2015",3199.99);
		Laptop l3 = new Laptop("Apple","2020",8199.99);
		
	List<Laptop> lst = new ArrayList<>();
	
	lst.add(l1);
	lst.add(l2);
	lst.add(l3);

	Collections.sort(lst);
	
	for (Laptop ll : lst) 
		System.out.println(ll.getMake() + "\t" + ll.getModel() + "\t" + ll.getPrice());
	
	}
	
	
}

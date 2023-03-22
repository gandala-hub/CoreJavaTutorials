package com.core.tutorial.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

public static void main(String[] args) {
		
		LinkedList<String> lst = new LinkedList<>();

		lst.add("Giri");
		lst.add("Kiran");
		lst.add("Giri1");
		lst.add("Moni");
		lst.add("Giri2");
		lst.add("Saket");
		lst.add("Giri");
		
		
	System.out.println("\n**** After Remove LinkedList*** ");
	for (String value : lst)
		System.out.println("Values    "  +  value);
	
	lst.remove(2);
	lst.add(2, "Inster at 2");
	lst.remove(4);
	lst.add(4, "Inster at 4");
	lst.remove(6);
	lst.add(6, "Inster at 6");
	

	System.out.println("\n**** After Rmove LinkedList*** ");
	for (String value : lst)
		System.out.println("Values    "  +  value);
}

}

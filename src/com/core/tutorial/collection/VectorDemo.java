package com.core.tutorial.collection;

import java.util.*;

public class VectorDemo {

	public VectorDemo() {

	}

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();

		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		v.addElement(40);
		v.addElement(50);
		v.addElement(60);
		v.addElement(70);
		v.add(90);
			
	for (Integer values : v)
			System.out.println(values);
	
	System.out.println("\n**** With Enumerator Printing Values ****");
	
	Enumeration<Integer> en = v.elements();
	while (en.hasMoreElements()) {
		System.out.println(en.nextElement());
		
	}
		
	}

}

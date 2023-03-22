/*
 *  Lsit has following implementations 
 *  ArrayList
 *  LinkedList
 *  Vector
 *  
 */

package com.core.tutorial.collection;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {

		List<String> lst = new ArrayList<>();
		List<Double> lst2 = new ArrayList<>();

		lst2.add(6.3);

		lst.add("Giri");
		lst.add("Kiran");
		lst.add("Moni");
		lst.add("Saket");
		lst.add("Giri");

		lst.add(2, "Andala");

		for (int i = 0; i < lst.size(); i++)
			System.out.println(lst.get(i));

		System.out.println("\nUsing Iterator \n ");
		Iterator<String> itr = lst.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		lst.remove(4);

		System.out.println("\n**** List of Values after removing the element at 4th postion*** ");

		for (String value : lst)
			System.out.println("Values    " + value);

		 Collections.sort(lst);

		
		  System.out.println("\n**** Using enhanced for Loop for a String Array*** ");
		  String[] arr = {"aa", "bb", "bb", "cc"} ;
		  
		  for (String lstValues : arr) System.out.println("Values    " + lstValues);
		 

		
		  System.out.println("\n**** Using Enhanced for loop  for ArrayList*** "); for
		  (String value : lst) System.out.println("Values    " + value);
		 

		System.out.println("\n**** Using lambard forEach method ArrayList*** ");
		lst.forEach((n) -> System.out.println(n));

		/*
		 * System.out.println("\n**** Using traditional for Loop ArrayList*** "); for
		 * (int i=0; i<lst.size(); i++) System.out.println(lst.get(i));
		 * 
		 */
	}
}

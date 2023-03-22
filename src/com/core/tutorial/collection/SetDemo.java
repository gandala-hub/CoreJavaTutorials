/*
 * Set has the following implementations
 *=====================================
 * HashSet
 * TreeSet
 * LinkedHashSet
 */


package com.core.tutorial.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
	
public static void main(String[] args) {
	
		/** HashSet Implementation **/
		
		HashSet<String> hSet = new HashSet<>();

		hSet.add("Giri");
		hSet.add("Kiran");
		hSet.add("Moni");
		hSet.add("Saket");
		hSet.add("Giri");
		
	System.out.println("\n**** Printing  HashSet*** ");
	System.out.println("\n**** Set Size*** " + hSet.size());
	for (String value : hSet)
		System.out.println("Values    "  +  value);
	
	
	/** TreeSet Implementation **/
	
	TreeSet<Integer> tSet = new TreeSet<>();

	tSet.add(100);
	tSet.add(15);
	tSet.add(60);
	tSet.add(200);
	tSet.add(2);
	tSet.add(2);
	
	System.out.println("\n**** Printing Tree Set*** ");
	System.out.println("\n**** Set Size*** " + tSet.size());
	for (int value : tSet)
		System.out.println("Values    "  +  value);
	
	
	/** LinkedHashSet Implementation **/	
	
	LinkedHashSet<Integer> lhSet = new LinkedHashSet<>();

	lhSet.add(100);
	lhSet.add(15);
	lhSet.add(60);
	lhSet.add(200);
	lhSet.add(200);
	lhSet.add(2);
	
	lhSet.remove(15);

	System.out.println("\n**** Using Enhanced for loop  for Linked Hash Set*** ");
	System.out.println("\n**** Set Size*** " + lhSet.size());
	for (int value : lhSet)
		System.out.println("Values    "  +  value);
	
	
}

}

package com.core.tutorial.collection;
import java.util.*;

public class MapDemo {

	public static void main(String[] args) {

	/********** HashMap Implementation **********/
		
	Map<Integer, String> hashMap = new HashMap<Integer, String>();
	
	hashMap.put(41, "Giri");
	hashMap.put(40, "Kiran");
	hashMap.put(10, "Moni");
	hashMap.put(8, "Saket");
	
	System.out.println("**** Printing HasMap ****");
	
		
	
	for (Map.Entry<Integer, String> entry: hashMap.entrySet()) {
		System.out.println("Key : \t " + entry.getKey() + "\t Value: \t " + entry.getValue());
	}
	
	
	/********** Linked HashMap Implementation **********/
	
	HashMap<Integer, String> lnkdHashMap = new LinkedHashMap<Integer, String>();
	hashMap.put(41, "Giri");
	hashMap.put(40, "Kiran");
	hashMap.put(10, "Moni");
	hashMap.put(8, "Saket");
	
	System.out.println("**** Printing Linked HashMap****");
	
	for (Map.Entry<Integer, String> entry: hashMap.entrySet()) {
		System.out.println("Key : \t " + entry.getKey() + "\t Value: \t " + entry.getValue());
	}
	
	
	
	/********** HashTable Implementation **********/
	
	Hashtable<Integer, String> hashtbl = new Hashtable<Integer, String>();
	hashtbl.put(41, "Giri");
	hashtbl.put(40, "Kiran");
	hashtbl.put(10, "Moni");
	hashtbl.put(8, "Saket");
	
	System.out.println("\n**** Printing HashTable ****");
	
	for (Map.Entry<Integer, String> entry: hashtbl.entrySet()) {
		System.out.println("Key : \t " + entry.getKey() + "\t Value: \t " + entry.getValue());
	}
		
	
	/********** TreeMap Implementation **********/
	
	
	TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
	treeMap.put(41, "Giri");
	treeMap.put(40, "Kiran");
	treeMap.put(10, "Moni");
	treeMap.put(8, "Saket");
		
	System.out.println("\n**** Printing TreeMap ****");
		
		for (Map.Entry<Integer, String> trmap: treeMap.entrySet()) {
			System.out.println("Key : \t " + trmap.getKey() + "\t Value: \t " + trmap.getValue());
		}
			
	}
	
}

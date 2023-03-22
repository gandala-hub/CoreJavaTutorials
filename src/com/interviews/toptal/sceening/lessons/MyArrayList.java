package com.interviews.toptal.sceening.lessons;

import java.util.*;

public class MyArrayList {
	
public static void main(String args[]) {
	
	int[] a1 = {1,2,3};
	
	
	for(int i : a1) {
		System.out.println(i);
	}

// ArrayList
	
	List<String> list1 = new ArrayList<>();
	list1.add("kiran");
	list1.add("ncjanj");
			
	Iterator it1 = list1.iterator();
	while (it1.hasNext()){
		System.out.println(it1.next());
	}
	
	list1.remove(1);
	
	Iterator it2 = list1.iterator();
	while (it2.hasNext()){
		System.out.println(it2.next());
	}
	
// Set
	
	System.out.println("/n This is my set values: ");
	Set<String> set1 = new HashSet<>();
	set1.add("kiran");
	set1.add("shfsjdh");
	set1.add("kiran");
	
	Iterator it3 = set1.iterator();
	while (it3.hasNext()) {
		System.out.println(it3.next());
	}
	
// HashMap values
	
	System.out.println("/n This is my HashMap values: ");
	Map<Float, Double> hmap = new HashMap<>();
	hmap.put(8.0f, 8977767867876788.78798798);
	hmap.put(2.3f, 23.45);
	hmap.put(2.5f, 89.07);
	
	for(Map.Entry<Float, Double> entry1: hmap.entrySet()) {
		System.out.println("Key : \t" + entry1.getKey() + "\t Value : \t" + entry1.getValue());
	}
	
}
}

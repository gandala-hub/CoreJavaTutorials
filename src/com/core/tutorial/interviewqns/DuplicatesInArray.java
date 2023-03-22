package com.core.tutorial.interviewqns;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {
		
		String Arr[] = {"Java","Array","C","Java","Dups","Lang","Test","Array","One","C"};
		//String Arr[] = {"Java","Array","C","Java","Dups"};
		
		/* 1st Method */
		
		System.out.println("1st Method");
		System.out.println("***********");
		
		  for (int i = 0; i < Arr.length; i++) { 
		  	for (int j = i+1; j < Arr.length; j++) {
		  		if(Arr[i].equals(Arr[j]))
		  			System.out.println("The Duplicate is " + Arr[i] );
		  	  
		  	} 
		  }
		 	
		/* 2nd Method */
		
		System.out.println();
		System.out.println("2nd Method");
		System.out.println("***********");
		Set<String> set = new HashSet<String>();
		for(String str : Arr) {
				if(!set.add(str))
				System.out.println(str + " is  a duplicate");
		}
	}
}

package com.core.tutorial.excercises;


public class FindWord {

	public static void main(String[] args) {
		
		String str1 = "String Concepts are Essesntial";
		System.out.println(" Given Word: \t " + args[0]);
		
		if (str1.contains(args[0]))
		System.out.println(" Occurance of word:   " + args[0]+ " is located at position:   " + str1.indexOf(args[0]) );
		else  
			System.out.println(" The given word not found"  );
	}

}

package com.core.tutorial.misc;

public class Recursion {

	public static void main(String[] args) {
		
		Factorial fact = new Factorial();
		int r = fact.fact(10);
		System.out.println("Factorial of 10 = " + r);
		
	}

}

class Factorial{
	
	int fact(int n) {
		
		int result;
		if (n==1) return 1;
		
		result = n*fact(n-1);
		return result;
		
		
	}
	
}

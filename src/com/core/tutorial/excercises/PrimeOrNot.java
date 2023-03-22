package com.core.tutorial.excercises;

public class PrimeOrNot {

	public static void main (String args[]) {
		
	int remainder;
	boolean isPrime = true;
	int i = 19;
	
	for(int j= 2; j<i/2; j++) {
		remainder = i%j;
		if(remainder==0)
		{
			isPrime=false;
			break;
		}
				
	}
	
	if (isPrime) System.out.println(i + "  is prime");
	else System.out.println(i + "  is not prime");
		
		
		
	}

	
	
}

package com.core.tutorial.excercises;

public class PrimeNums {

	public static void main(String[] args) {
	int remainder;
	int k[] = new int[50];
	int x=0;
	
	for (int i=1; i<50; i++) {
		boolean isPrime = true;	
		for (int j = 2; j<i/2; j++) {
			remainder= i%j;
			
			if (remainder== 0) {
				isPrime = false;
				break;
				}
						
		}
		
		if(isPrime) { k[x] = i; x++; }
		
	}
	
	for (int y : k)
		System.out.println("Prime Values:  " + y + "\t");

	}

}

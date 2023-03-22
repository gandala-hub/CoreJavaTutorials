
/*
 * Finding Missing number in a sequence of ascending order 
 */
package com.core.tutorial.interviewqns;

public class MissingNum {

	public static void main(String[] args) {
		int num[] = {1,2,3,4,5,6,7,9,10};
		int sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			sum = sum+ num[i];
		}
		
		int sum1= 0;
		for (int j = 1; j <= 10; j++) {
			sum1 = sum1+ j;
		}
		
	int missing = sum1 - sum;
	
	System.out.println("Missing Number :  " + missing);
	}

}

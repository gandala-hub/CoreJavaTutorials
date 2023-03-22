package com.core.tutorial.interviewqns;

import java.util.Arrays;

public class LargeSmallInArray {


	public static void main(String[] args) {
		int Arr[] = {5,20,-5,24,66,-1};
		int largest = Arr[0];
		int smallest = Arr[0];
		
		for (int i = 1; i < Arr.length; i++) {
			if (Arr[i]>largest) {
				largest=Arr[i];
			}
			else if (Arr[i]<smallest) {
				smallest = Arr[i];
			}
		}
		System.out.println("Array" + Arrays.toString(Arr));
		System.out.println("Larget" + largest);
		System.out.println("Smallest" + smallest);
		}

}

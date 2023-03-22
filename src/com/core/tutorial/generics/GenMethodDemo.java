package com.core.tutorial.generics;

public class GenMethodDemo {

	public static void main(String[] args) {
		
		Integer nums[] = {10, 20, 30, 40};
		
		showGen(nums);
		
	}
	
	public static <T> void showGen(T[] tObj){
		
		for(T values : tObj ) {
			System.out.println(values);
						
		}
		
				
	}

}

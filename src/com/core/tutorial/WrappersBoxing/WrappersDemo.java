package com.core.tutorial.WrappersBoxing;

public class WrappersDemo {
	
	static int method(Integer intObj) {
		return intObj;
	}
	
	public static void main(String[] args) {
		//before Java9 - Deprecated
		Integer intObj = new Integer(100);    // This is Boxing
		System.out.println(intObj);
		
		
		System.out.println("toString");
		System.out.println( intObj + "\t"+ intObj.toString() + "\t"+ Integer.toString(200) + "\t"+ Integer.toString(500, 8));
		
				
		//After Java9 - The Wrapper Constructors are Deprecated
		
		Integer intObj1 = Integer.valueOf(200);  // This is Boxing
			System.out.println(intObj1);  
		int i = intObj1.intValue(); // This is unBoxing
			System.out.println(i);
		


		//Auto Boxing and Auto-UnBoxing
		Integer intAutoBoxObj = 100; // This is Auto-Boxing
		int j = intAutoBoxObj; // This is Auto-UnBoxing
		System.out.println(intAutoBoxObj + "\t" + j);
		
		
		// Auto-Box/Un-Box pass in a method
		Integer intObj2 = method(100);     System.out.println(intObj2 );
		int x = intObj2*10;                System.out.println(x );

		// AutoBoxing in parameter passing in method 
		Integer IntObj2 = method(2000);
		System.out.println(IntObj2);
		
		// AutoBoxing in Arithmetic expressions 
		Integer IntObj3= method(2000);
		++IntObj3; System.out.println(IntObj3);
		
		IntObj3 = IntObj3 + (IntObj3/4);
		System.out.println(IntObj3);
		
		x = IntObj3 + (IntObj3/4);
		System.out.println(x);
		
		
		
		
		
	}

}

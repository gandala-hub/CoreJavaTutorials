
/*
 
Java defines several type promotion rules that apply to expressions. 
They are as follows: 
 
First: All byte, short, and char values are promoted to int.
=>Then, if one operand is a long, the whole expression is promoted to long. 
=>If one operand is a float, the entire expression is promoted to float. 
=>If any of the operands is double, the result is double.

*/



package com.core.tutorial.typepromotion;

public class ArithmeticEx1 {

	public static void main(String args[]) {
		byte b = 42;
		char c = 'a';
		short s = 1024;
		int i = 50000;
		float f = 5.67f;
		double d = .1234;
		double result = (f * b) + (i / c) - (d * s);
		System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
		System.out.println("result = " + result);
		}
}

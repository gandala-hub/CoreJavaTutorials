/*

Data Types:
===========

Integer Literals:
-----------------
byte:  1 byte   : –128 to 127
short: 2 bytes  : –32,768 to 32,767
int:   4 bytes  : –2,147,483,648 to 2,147,483,647
Long:  8 bytes  : –9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

By default : Integer literals create an int value, which in Java is a 32-bit integer value. that's why to specify a long
literal, you will need to explicitly tell the compiler that the literal value is of type long. You
do this by appending an upper- or lower case L to the literal.

Floating Point Literals:
------------------------
float:  4 bytes  : 4.9e–324 to 1.8e+308
double: 8 bytes  : 1.4e–045 to 3.4e+038

Chars: 2 bytes 	 : 0 to 65,536 		: Java uses Unicode to represent characters. (http://unicode.org/main.html)

Boolean:         : true or false 	: Java has a primitive type.

*/



package com.core.tutorial.datatypes;

public class DaataTypesEx1 {

	public static void main(String[] args) {
		byte b = 100;
		short s = 200;
		int i = 300;
		long l = 500;
		long ll = 1500L;
		
		float f = 1.4f;
		double d = 2.8;
		
		char c = 'c'; 
		char ch = 88; 
		char newline ='\n';

		System.out.print("b:  " + b + "\t" + "s:  " + s + "\t" + "i:  " + i + "\t");
		System.out.println();
		System.out.print("l:  " + l + "\t" + "ll:  " + ll);  
		System.out.println();
		System.out.print("f:  " + f + "\t" + "d:  " + d);
		System.out.println();
		System.out.print("c:  " + c + "\t" + "ch:  " + ch + "\t" + "++ch:  " + (++ch) + "\t" + "newline:  " + newline + "newline" );
				

	}

}

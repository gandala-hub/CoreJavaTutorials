/*
* When a member is declared static, it can be accessed before any objects of its class are created, and without reference to any object.
 
Methods declared as static have several restrictions:
	• They can only call other static methods.
	• They must only access static data.
	• They cannot refer to this or super in any way.
*/
package com.core.tutorial.staticexamples;

class StaticMethodEx1 {
static int a = 3;
static int b;

static void meth(int x) {
	System.out.println("x = " + x);
	System.out.println("a = " + a);
	System.out.println("b = " + b);
	}

static {
	System.out.println("Static block initialized.");
	b = a * 4;
	}

	{
	System.out.println("initialization Block");
	b = a * 4;
	}
	
	public StaticMethodEx1()
	{
		System.out.println("No Args Constructor");
	}

public static void main(String args[]) {
	meth(42);
	new StaticMethodEx1();
	}
}
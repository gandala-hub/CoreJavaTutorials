/*
 * When a member is declared static, it can be accessed before any objects of its class are created, and without reference to any object.
 */

package com.core.tutorial.staticexamples;

class Test{
	static int a = 20;

	void printA(){
	System.out.println("Value of static int a \t" + a);
}
	
}

public class StaticVar {
public static void main (String[] args) {
	Test t1 = new Test();
	Test t2 = new Test();

	t1.printA();
	Test.a = 30;
	t2.printA();
}
}

/*
 * In Java, when you pass a primitive type to a method, it is passed by value.
 * Thus, what occurs to the parameter that receives the argument has no effect outside the method.
 */


package com.core.tutorial.callby;

public class CallByValue {
	public static void main(String args[]) {
		Test ob = new Test();
		int a = 15, b = 20;
		System.out.println("a and b before call: " + a + " " + b); 
		ob.meth(a, b);
		System.out.println("a and b after call: " + a + " " + b);
		}

}



//Primitive types are passed by value.
class Test {
void meth(int i, int j) {
i *= 2;
j /= 2;

System.out.println("In the method \t" + i + "\t" + j);
}
}

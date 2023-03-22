/*
 * When a primitive type is passed to a method, it is done by use of call-by-value. Objects
are implicitly passed by use of call-by-reference.

 */


package com.core.tutorial.callby;

public class CallByReferenceDemo {
	
	public static void main(String args[]) {
		Test1 ob = new Test1(15, 20);
		System.out.println("ob.a and ob.b before call: " +  ob.a + " " + ob.b);
		ob.meth(ob);
		System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
		}

}



//Objects are passed by reference.
class Test1 {
int a, b;
Test1(int i, int j) {
a = i;
b = j;
}
//pass an object
void meth(Test1 o) {
o.a *= 2;
o.b /= 2;
}
}
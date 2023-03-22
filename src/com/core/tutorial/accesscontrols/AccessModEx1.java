/*
 * public: The public member if the class can be accessed by any other code.
 * Private: The private member can only be accessed by other members of its class.
 * default:When no access specifier is used, then by default the member of a class is public within its own package, but cannot be accessed outside of its package.
 * protected: protected applies only when inheritance is involved
 */


package com.core.tutorial.accesscontrols;

public class AccessModEx1 {

	public static void main(String args[]) {
		Test ob = new Test();
		// These are OK, a and b may be accessed directly
		ob.a = 10;
		ob.b = 20;
		// This is not OK and will cause an error
		// ob.c = 100; // Error!
		// You must access c through its methods
		ob.setc(100); // OK
		System.out.println("a, b, and c: " + ob.a + " " +
		ob.b + " " + ob.getc());
		}

}


/* This program demonstrates the difference between
public and private.
*/
class Test {
int a; // default access
public int b; // public access
private int c; // private access
// methods to access c
void setc(int i) { // set c's value
c = i;
}
int getc() { // get c's value
return c;
}
}
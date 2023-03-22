/*
 * If you need to do computation in order to initialize your static variables, you can declare a static block 
 * that gets executed exactly once, when the class is first loaded.
 */
package com.core.tutorial.staticexamples;

class StaticBlockDemo {
public static void main(String[] args)
{
System.out.println("Inside Main Method");

new Child();

System.out.println();
System.out.println("********************");
System.out.println();

new Parent();

System.out.println();
System.out.println("********************");
System.out.println();

new Child();
}
}

class Child extends Parent {
	
	static {
		System.out.println("Inside Child static block");
			}
	{
		System.out.println("Inside Child Initialization block");
	}
	
	Child() {
		
		System.out.println("Inside Child Constructor block");
	}
}

class Parent {
	
	static {
		System.out.println("Inside Parent static block");
			}
	{
		System.out.println("Inside Parent  Initialization block");
	}
	
	Parent() {
		
		System.out.println("Inside Parent Constructor block");
		
	}
}
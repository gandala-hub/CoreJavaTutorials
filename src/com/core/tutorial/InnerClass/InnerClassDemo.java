/*
 * There are two types of nested classes: static and non-static. 

* A static nested class is one that has the static modifier applied. Because it is static, it must access the members of its
enclosing class through an object. That is, it cannot refer to members of its enclosing class
directly. Because of this restriction, static nested classes are seldom used.

* The most important type of nested class is the inner class. An inner class is a non-static
nested class. It has access to all of the variables and methods of its outer class and may refer
to them directly in the same way that other non-static members of the outer class do.

* An inner class has access to all of the members of its enclosing class, but
the reverse is not true. Members of the inner class are known only within the scope of the
inner class and may not be used by the outer class.

*While nested classes are not applicable to all situations, they are particularly helpful when handling events.
*
*
*
*Compelling reasons for using nested classes include the following:

It is a way of logically grouping classes that are only used in one place: If a class is useful to only one other class, then it is logical to embed it in that class and keep the two together. Nesting such "helper classes" makes their package more streamlined.

It increases encapsulation: Consider two top-level classes, A and B, where B needs access to members of A that would otherwise be declared private. By hiding class B within class A, A's members can be declared private and B can access them. In addition, B itself can be hidden from the outside world.

It can lead to more readable and maintainable code: Nesting small classes within top-level classes places the code closer to where it is used.

*/


package com.core.tutorial.InnerClass;

class InnerClassDemo {
	public static void main(String args[]) {
		Outer outer = new Outer();
		outer.test();

	}
}



//Demonstrate an inner class.
class Outer {
	int outer_x = 100;
	void test() {
		Inner inner = new Inner();
		inner.display();
	}

	//this is an inner class
	class Inner {
		int x =10;
		void display() {
			System.out.println("display: outer_x = " + outer_x);
			System.out.println("Inner x  = " + x);
		}
	}
}
/*

Dynamic Method Dispatch/ Runtime Polymorphism
--------------------------------------------
*It is the type of the object being referred to (not the type of the reference variable)
that determines which version of an overridden method will be executed
 
* Overridden methods allow Java to support run-time polymorphism.
Polymorphism is essential to object-oriented programming for one reason: it allows a
general class to specify methods that will be common to all of its derivatives, while allowing
subclasses to define the specific implementation of some or all of those methods. Overridden
methods are another way that Java implements the “one interface, multiple methods” aspect
of polymorphism

***
*Dynamic, run-time polymorphism is one of the most powerful mechanisms that object oriented
design brings to bear on code reuse and robustness. The ability of existing code
libraries to call methods on instances of new classes without recompiling while maintaining
a clean abstract interface is a profoundly powerful tool

 */


package com.core.tutorial.overriding;


class X {
void callme() {
System.out.println("Inside A's callme method");
}
}

class Y extends X {
// override callme()
void callme() {
System.out.println("Inside B's callme method");
}
void showY(){
	System.out.println("Show Y");
}
}
class Z extends X {
// override callme()
void callme() {
System.out.println("Inside C's callme method");
}
void showZ(){
	System.out.println("Show Z");
}
}
class Dispatch {
public static void main(String args[]) {
X x = new X(); // object of type A
Y y = new Y(); // object of type B
Z z = new Z(); // object of type C

y.showY();
z.showZ();

X r; // obtain a reference of type X
r = x; // r refers to an A object
r.callme(); // calls X's version of callme
r = y; // r refers to a Y object
r.callme(); // calls Y's version of callme
y.showY();
r = z; // r refers to a Z object
r.callme(); // calls Z's version of callme
z.showZ();
}
}
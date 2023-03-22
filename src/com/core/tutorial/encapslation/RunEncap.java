/*
Encapsulation is one of the four fundamental OOP concepts. The other three are inheritance, polymorphism, and abstraction.

Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.
To achieve encapsulation in Java −
Declare the variables of a class as private.
Provide public setter and getter methods to modify and view the variables values.

Benefits of Encapsulation

The fields of a class can be made read-only or write-only.
A class can have total control over what is stored in its fields.

*/

package com.core.tutorial.encapslation;

public class RunEncap {

	   public static void main(String args[]) {
	      EncapTest encap = new EncapTest();
	      encap.setName("James");
	      encap.setAge(20);
	      encap.setIdNum("12343ms");

	      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
	   }
	}


class EncapTest {
	   private String name;
	   private String idNum;
	   private int age;

	   public int getAge() {
	      return age;
	   }

	   public String getName() {
	      return name;
	   }

	   public String getIdNum() {
	      return idNum;
	   }

	   public void setAge( int newAge) {
	      age = newAge;
	   }

	   public void setName(String newName) {
	      name = newName;
	   }

	   public void setIdNum( String newId) {
	      idNum = newId;
	   }
	}

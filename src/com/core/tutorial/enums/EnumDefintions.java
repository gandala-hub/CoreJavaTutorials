/*
 * Java Enums. The Enum in Java is a data type which contains a fixed set of constants. ...
 The Java enum constants are static and final implicitly. 
 It is available since JDK 1.5. Enums are used to create our own data type like classes
 * 
 * Enums are used when we know all possible values at compile time, such as choices on a menu, days of a week
 * The main objective of enum is to define our own data types(Enumerated Data Types).
 * 
 * Every enum internally implemented by using Class.
/* internally above enum Color is converted to
class Color
{
     public static final Color RED = new Color();
     public static final Color BLUE = new Color();
     public static final Color GREEN = new Color();
}

Enum and Inheritance :

All enums implicitly extend java.lang.Enum class. As a class can only extend one parent in Java, so an enum 
cannot extend anything else.
toString() method is overridden in java.lang.Enum class,which returns enum constant name.
enum can implement many interfaces.

values(), ordinal() and valueOf() methods :

These methods are present inside java.lang.Enum.
values() method can be used to return all values present inside enum.
Order is important in enums.By using ordinal() method, each enum constant index can be found, just like array index.
valueOf() method returns the enum constant of the specified string value, if exists

*/

package com.core.tutorial.enums;

enum Chineese_Menu {
	
SOUP_CHICKEN(150),
SOUP_VEG (100);

private int value;

private Chineese_Menu(int value) {
	this.value = value;
}

public int getValue() {
	return value;
}
}


enum AgeLimit {
	MINOR_MAX(18),
	ADULT_MAX(60),
	SENIOR_MAX(150);
	
	int ageLimit;

	private AgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	public int getAgeLimit() {
		return ageLimit;
	}
	

	}


enum TicketCostRange {
	
	MINOR_TICKET_COST(500),
	ADULT_TICKET_COST(1000),
	SENIOR_TICKET_COST(750);
	
	int tktCost;

	private TicketCostRange(int tktCost) {
		this.tktCost = tktCost;
	}

	public int getTktCost() {
		return tktCost;
	}
}


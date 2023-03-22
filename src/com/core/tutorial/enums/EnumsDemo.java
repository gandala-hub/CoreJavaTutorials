package com.core.tutorial.enums;

public class EnumsDemo {
	
	public enum Fqrt { Q1, Q2, Q3, Q4 }  

	public EnumsDemo() {
		super();
	}
	
	
	public int getTicketCostForAge(AgeLimit ageLimit)
	
	{
	switch (ageLimit) {
	case MINOR_MAX :
	return TicketCostRange.MINOR_TICKET_COST.getTktCost();
	
			
	case ADULT_MAX :
	return TicketCostRange.ADULT_TICKET_COST.getTktCost();

	default:
	return TicketCostRange.SENIOR_TICKET_COST.getTktCost();

	}	
		
	}

	public static void main(String[] args) {
		
		Chineese_Menu[] menu = Chineese_Menu.values();
		System.out.println("****Display Chineese Menu****");
		for (Chineese_Menu menuValues : menu) {
						System.out.println("Price of " + menuValues.name() + " is \t" + menuValues.getValue() );	
		}
		EnumsDemo enumDemo = new EnumsDemo();
		System.out.println(" \n****Get Ticket Cosrts for Minors, Adults and Seniors****");
		System.out.println("Minor Max Age    :  "  +  AgeLimit.MINOR_MAX.getAgeLimit() + "\t& Ticket Cost :  "+ enumDemo.getTicketCostForAge(AgeLimit.MINOR_MAX));
		System.out.println("Adult Max Age    :  "  +  AgeLimit.ADULT_MAX.getAgeLimit() + "\t& Ticket Cost :  "+ enumDemo.getTicketCostForAge(AgeLimit.MINOR_MAX));
		System.out.println("Senior Max Age   :  " +  AgeLimit.SENIOR_MAX.getAgeLimit() + "\t& Ticket Cost :  "+ enumDemo.getTicketCostForAge(AgeLimit.SENIOR_MAX));
	
	
	System.out.println("\n****Financial Quarters****");
	for (Fqrt s : Fqrt.values())  
		System.out.println(s);  
	

}	
}



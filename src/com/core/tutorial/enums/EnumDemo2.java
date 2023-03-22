package com.core.tutorial.enums;

enum Apple{Jonathan, GoldenDel, RedDel, Winesap, Cortland}

public class EnumDemo2 {

	public static void main(String[] args) {
	Apple ap, ap1, ap2, ap3, ap4;
	
	System.out.println("Here are all apple constants and their ordinal values:");
	
	for(Apple a: Apple.values()) 
		System.out.println(a + "    Ordinal:  "+ a.ordinal());

	ap1 = Apple.Jonathan;
	ap2= Apple.GoldenDel;
	ap3 = Apple.GoldenDel;
	
	if(ap1.compareTo(ap2)<0)
			System.out.println(ap1 + "  comes before  " +ap2);
	if(ap2.equals(ap3))
		System.out.println(ap2 + "  equals  " +ap3);
	if(ap2 == ap3)
		System.out.println(ap2 + "  ==  " +ap3);
	}

}



package com.core.tutorial.enums;

enum Orange {
	
	Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);
	
	int orangeCost;
	Orange(int i){
		orangeCost = i;
	}

	Orange(){
		orangeCost = 50;
	}
	
	 int getOrangeCost() {
		return orangeCost;
	}
}

public class EnumDemo3 {

public static void main(String Args[]) {
	
	System.out.println("All Orange prices:");
	for (Orange or : Orange.values()) 
		System.out.println(or+ "   price : " + or.getOrangeCost());
}
	
	
}

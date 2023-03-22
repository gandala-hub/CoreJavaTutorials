package com.core.tutorial.collection;

import javax.xml.ws.handler.MessageContext.Scope;

public class Laptop implements Comparable<Laptop> {
String make;
String model;
Double price;

Laptop(String make, String model, Double price){
this.make = make;
this.model = model;
this.price = price;
}

public String getMake() {
	return make;
}

public String getModel() {
	return model;
}

public Double getPrice() {
	return price;
}

@Override
	public int compareTo(Laptop o) {
		if(this.price > o.price) return 1;
		else return -1;
	}


}

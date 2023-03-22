package com.core.tutorial.generics;

public class TwoGenDemo {

	public static void main(String[] args) {

		TwoGen<Integer, String> twoGenDemo= new TwoGen<Integer, String>(100, "Giribabu");
		twoGenDemo.showGen();
	}

}


class TwoGen<T extends Number, V > {
	
	T tObj;
	V vObj;
	

	public TwoGen(T tObj, V vObj) {
		super();
		this.tObj = tObj;
		this.vObj = vObj;
	}

	public T gettObj() {
		return tObj;
	}

	public V getvObj() {
		return vObj;
	}
	
	void showGen() {
		System.out.println("T Value \t" + tObj.getClass().getName());
		System.out.println("v Value \t" + vObj.getClass().getName());
		System.out.println("T Value \t" + tObj.intValue());
		System.out.println("v Value \t" + vObj.toString());		
	}
	
}
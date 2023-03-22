package com.core.tutorial.abstractconcepts;

class AbstractDemo1 {

	public static void main(String args[]) {
		Sub subOb= new Sub();
		subOb.abstSuper();
		subOb.nonAbstractMeth();
		subOb.ConcreteMethSub();
		
		Super superOb= new Sub();
		superOb.abstSuper();
		superOb.nonAbstractMeth();
		

		
	}
}



abstract class Super{
int x,y;

abstract void abstSuper();


void nonAbstractMeth() {
	System.out.println("Super class Non Abstarct method  ");
	}
}


class Sub extends Super{
	
	public void abstSuper(){
		System.out.println("Super class Abstarct method implemented in sub class ");
		
	}
	public void ConcreteMethSub(){
		System.out.println("Concrete method implemented in sub class ");
		
	}
	
}
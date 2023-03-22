package com.core.tutorial.generics;


public class GenWildDemo {

	public static void main(String[] args) {
		Integer inums[] = {2,4,6,8};
		GenWild<Integer> iobj = new GenWild<Integer> (inums) ;
		Double dnums[] = {2.0, 4.0, 6.0, 8.0};
		GenWild<Double> dobj = new GenWild<Double> (dnums) ;
		System.out.println(iobj.sameAvg(dobj));
		
	}

}


class GenWild<T extends Number >{
	T[] tObj;
	
	
	GenWild (T[] tObj ){
	super();
	this.tObj= 	tObj;
	}


	public T[] gettObj() {
		return tObj;
	}


		
	double average() {
		double sum=0.0;
		for ( int i =0; i<tObj.length; i++ )
			sum += tObj[i].doubleValue();
		
			return sum/tObj.length;
	}
	
boolean sameAvg(GenWild<?> obj) {
	
	if (this.average() == obj.average())
	return true;
	
	return false;
	
}	
	
}



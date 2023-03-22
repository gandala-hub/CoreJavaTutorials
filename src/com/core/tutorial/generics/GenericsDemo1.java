/**
 * 
 */
package com.core.tutorial.generics;

/**
 * @author gandala
 *
 */

class Gen<T>{
	T obj;
	
	
	public Gen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gen(T obj) {
		super();
		this.obj = obj;
	}

	T getObj(){
		return obj;
	}
	
	void showType(){
		System.out.println("Type of T " + obj.getClass().getName());
	}
}

public class GenericsDemo1 {

	public static void main(String[] args) {
		
		 Gen<Integer> gendemoInt;
		 Gen<String> gendemoStr;
		 Gen<Float> gendemoFlt;
		
		gendemoInt= new Gen<Integer>(new Integer(100));
		gendemoStr= new Gen<String>("GenDemo");
		gendemoFlt= new Gen<Float>(10.4F);
	

		gendemoInt.showType();
		System.out.println(gendemoInt.getObj());
		
		
		gendemoStr.showType();
		System.out.println(gendemoStr.getObj());
		
		gendemoFlt.showType();
		System.out.println(gendemoFlt.getObj());
		
		
		
		//Auto Boxing
		int i = gendemoInt.getObj();
		System.out.println(i);
		
	}

}



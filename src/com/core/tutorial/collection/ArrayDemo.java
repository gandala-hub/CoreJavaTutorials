package com.core.tutorial.collection;

public class ArrayDemo {

	public ArrayDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Integer[] iObj= {10, 20, 30, 40};
	
		for(Integer values : iObj )
		{
				System.out.print(values.intValue() + "\t");
				System.out.println(values);
		}

		int arr[];
		arr= new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		
		int arr1[] = {1,2,3};
		
		ArrayEx arrayObj = new ArrayEx();
		arrayObj.m1(arr1);
		
		for(int values : arr1)
		System.out.println(values);
		
	}
}


class ArrayEx{
	
	void m1(int arrM[]) {
		
		for (int i = 0; i < arrM.length; i++) {
			arrM[i] += arrM[i];
	
		}
		
				
	}
}
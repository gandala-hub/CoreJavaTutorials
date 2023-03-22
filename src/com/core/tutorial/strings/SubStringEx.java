package com.core.tutorial.strings;

public class SubStringEx {
	
	public int subEx(String str1, String str2) {
		
		int count =0;
		
		for(int i = 0; i<str2.length(); i++) {
			
			if(str2.substring(str2.length()-1,str2.length()).equals(str1)) count++;
			
		}
		
		return count;
		
		
	}

	public static void main(String args[]){
		SubStringEx subEx = new SubStringEx();
		System.out.println("Count :     " + subEx.subEx("a", "abc"));
		
		String a = "Giri";
		System.out.println("Giri   :  " + a.substring(0,4));
		
				
		
	}
}


/*
Output
a : abc  1
a : aabc 2
a : aaac 3
*/
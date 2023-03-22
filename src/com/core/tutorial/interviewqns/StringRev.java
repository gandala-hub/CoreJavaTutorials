/*
 * String Reverse
 */

package com.core.tutorial.interviewqns;

public class StringRev {

	public static void main(String[] args) {
	
		String str = "Welcome";
		String strRev = "";
		for (int i = str.length()-1; i >=0; i--) {
			strRev = strRev+ str.charAt(i);
		}
		System.out.println("Reverse of " + str + "  :  " + strRev);
		
		//2 nd way
		
		StringBuffer strbff = new StringBuffer("Welcome");
		System.out.println("Reverse of " + strbff + "  :  " + strbff.reverse());
		
		
	}

}


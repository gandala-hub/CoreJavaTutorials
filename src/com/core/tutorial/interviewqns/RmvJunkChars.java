/*
 * Remove all junk unwanted characters from a string
 */

package com.core.tutorial.interviewqns;

public class RmvJunkChars {
	public static void main(String[] args) {
		String str1= "@#$%Welcome##))**,,,..To @^^ Strings%%^^**";
		
		str1 = str1.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(str1);
		//str1 = str1.replaceAll("\\s{2,}", " ").trim();
		str1 = str1.trim().replaceAll("\\s+", " ");
		System.out.println(str1);
	}
	
}

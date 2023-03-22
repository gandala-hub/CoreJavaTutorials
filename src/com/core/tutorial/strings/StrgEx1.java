package com.core.tutorial.strings;
import org.apache.commons.lang3.StringUtils;
public class StrgEx1 {

	public static void main(String[] args) {
		String str1 = "Java    String     Concepts are              Essential";
		// String str1 = "Javasss String ss ConceptssaressssssssssEssential";
		String str2 = new String();
		String str3 = new String();
		StringBuffer sb = new StringBuffer();
		String strArr1[];
		
		System.out.println("str1: " + str1);
		//strArr1= str1.split("s");
		strArr1= str1.split(" ");
		System.out.print("strArr1 length: " + strArr1.length + " \t");
		for (int i=0; i<strArr1.length; i++)
		{
			//System.out.print(" \n Splint strings: "+ strArr1[i]);
			if (! StringUtils.isBlank(strArr1[i])) {
			sb.append(strArr1[i]);
			sb.append(" ");
			str2 = str2 + strArr1[i] + " ";
			str3 = str3.concat(strArr1[i]).concat(" ");
		}
		}
	System.out.println("\nResult1: "+ sb.toString().trim());	
	System.out.println("Result2: "+ str2.trim());
	System.out.println("Result3: "+ str3.trim());	
}
}
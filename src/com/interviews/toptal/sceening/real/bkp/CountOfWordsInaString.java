package com.interviews.toptal.sceening.real.bkp;

public class CountOfWordsInaString {
	 
    public static void main(String[] args) {
 
        //String str = "Java programming question";
    	//String str = "We test coders. Give us a try?";
		String str = "Forget   CVs..Save time . X x";
        
		/*
		 * if (str == null || str.isEmpty()) { return null; }
		 */
 
        //print number of words
        System.out.println(str.split("\\s+").length);
    } 
}
package com.interviews.toptal.sceening.real;

public class DisappearingPairs {
	
	public String solution (String s) {
		StringBuilder sb = new StringBuilder();
		System.out.println("String builder value is: "+ sb.toString());
		
	
		for (char ch: s.toCharArray()) {
			int size = sb.length();
			
			if (size > 0 && (sb.charAt(size-1) == ch) ) {
				sb.deleteCharAt((size-1));
				
			}
			else {
				sb.append(ch);
			}
			
		}
		return sb.toString();
	}
	
	public static void main(String args[]) {
		DisappearingPairs dps = new DisappearingPairs();
		System.out.println("Result is: " + dps.solution("AACBBCCCA"));
	}
}

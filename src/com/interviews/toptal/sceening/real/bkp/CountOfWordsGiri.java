package com.interviews.toptal.sceening.real.bkp;

public class CountOfWordsGiri {
	
	public static void main(String args[]) {
		String S1 = "We test coders. Give us a try?";
		//String S2 = "Forget   CVs..Save time . X x";
		
		System.out.println(solution(S1));
		//System.out.println(solution(S2));
	}
	
	public static int solution(String S) {
		int maxWords=0;
		String temp[]= S.split("\\.|\\?|\\!");
		//System.out.println("temp :" + temp.length);
		
		for(int i=0; i<temp.length; i++)
		{
		//System.out.println("temp :" + temp[i]);
		String[] words = temp[i].trim().split("\\s+");
		if(maxWords<words.length)maxWords=words.length;
		}
			
		return maxWords;
	}

}
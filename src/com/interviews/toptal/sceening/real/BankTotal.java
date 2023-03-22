package com.interviews.toptal.sceening.real;

import java.time.LocalDate;


public class BankTotal {

	public static void main(String[] args) {
		
		int total = 0;
		int netBalance = 0;

		// int[] A = {100, 100, 100, -10};
		// String[] D = {"2020-12-31","2020-12-22","2020-12-03", "2020-12-29"};
		 //230
		
		  //int[] A = {180, -50, -25, -25}; 
		 // String[] D = {"2020-01-01","2020-01-01","2020-01-01", "2020-01-31"};
		  //25
		 

		 //int[] A = {1, -1, 0, -105,1};
		 //String[] D = {"2020-12-31","2020-04-04","2020-04-04","2020-04-14","2020-07-12"};
		 //-164

		 int[] A = {100, 100, -10, -20,-30};
		 String[] D = {"2020-01-01","2020-02-01","2020-02-11","2020-02-05","2020-02-08"};
		 //80
		 
		//System.out.println("Total Fee : " + solution(A, D));

		for(int val : A) {
			total  = total+ val;
		}
		
		//System.out.println("total  : " + total);
		netBalance= netBalance+total+solution(A, D);
		System.out.println("netBalance  : " + netBalance);
		

	}

	public static int solution(int[] A, String[] D) {
		int totalFee = -60;

		LocalDate date[] = new LocalDate[D.length];
		for (int i = 0; i < D.length; i++) {
			date[i] = LocalDate.parse(D[i]);
			//System.out.println(date[i]);
		}

		for (int j = 0; j < date.length-1; j++) {
			int purchageAmount = 0;
			int purchageCount = 1;
			//System.out.println("Start J loop :  " + "Date : " + date[j]  + "   Value: " + A[j]);
				for (int k = j+1; k < date.length; k++) {
					if (date[j].getMonthValue() == date[k].getMonthValue()) {
						if (A[j] < 0) {
						   // System.out.println("Date : " + date[j]  + "   Value: " + A[j] + "  Date : " + date[k]  + "   Value: " + A[k]);
							purchageAmount = purchageAmount + A[j];
							purchageCount++;
							
							//System.out.println(purchageAmount + "   " + purchageCount);
						}
						if ((purchageCount >2) && (purchageAmount <= -100))
							totalFee = totalFee + 5;
					}
				
				}
				//System.out.println("End J loop :  " + "Date : " + date[j]  + "   Value: " + A[j]);
		}
		
		return totalFee;
	}
}

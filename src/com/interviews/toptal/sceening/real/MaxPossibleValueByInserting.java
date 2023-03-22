package com.interviews.toptal.sceening.real;

public class MaxPossibleValueByInserting {

// Function to find the maximum value
	// of N after inserting the digit K
public static void maximizeNumber(int N, int K)
{
	// Convert it into N to string
	String s = Integer.toString(N);
	int L = s.length();

	// Stores the maximum value of N
	// after inserting K
	String result = "";
	int i = 0;

	// Iterate till all digits that
	// are not less than K
	while ((i < L) && (K <= ((int)s.charAt(i) - (int)'0'))) {

		// Add the current digit to
		// the string result
		result += (s.charAt(i));
		++i;
	}

	// Add digit 'K' to result
	result += ((char)(K + (int)'0'));

	// Iterate through all remaining
	// characters
	while (i < L) {

		// Add current digit to result
		result += (s.charAt(i));
		++i;
	}

	// Print the maximum number formed
	System.out.println(result);
}

	// Driver Code
	public static void main (String args[]) {
		//int N = 6673, K = 6;
		//int N= 1234, K =5;
		//int N= 7643, K =5;
		//int N = 0, K = 5;
		int N = 661, K = 5;
		maximizeNumber(N, K);
	}

}

//This code is contributed by _saurabh_Jaiswal.

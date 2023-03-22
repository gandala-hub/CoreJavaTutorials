package com.interviews.toptal.sceening.lessons.bkp;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.PriorityQueue;
	import java.util.Arrays;

	class InversionCountInArray {
	public static int getNumOfInversions(List<Integer> A)
	{
		int N = A.size();
		if (N <= 1) {
		return 0;
		}

		PriorityQueue<int[]> sortList
		= new PriorityQueue<>((a, b) -> a[0] - b[0]);
		int result = 0;

		// Heapsort, O(N*log(N))
		for (int i = 0; i < N; i++) {
		sortList.add(new int[] { A.get(i), i });
		}

		// Create a sorted list of indexes
		List<Integer> x = new ArrayList<>();
		while (!sortList.isEmpty()) {
		// O(log(N))
		int[] v = sortList.poll();

		// Find the current minimum's index
		// the index y can represent how many minimums
		// on the left
		int y = x.size()
			- x.subList(0, x.size()).indexOf(v[1])
			- 1;
		int z = 0;
		if (!x.isEmpty()) {
			z = binarySearch(x, 0, x.size() - 1, v[1]);
			if (z < 0) {
			z = -(z + 1);
			}
		}

		// i can represent how many elements on the left
		// i - y can find how many bigger nums on the
		// left
		result += v[1] - z;

		x.add(v[1]);
		x.sort(null);
		}

		return result;
	}

	// Implementing binary search
	private static int binarySearch(List<Integer> list,
									int start, int end,
									int key)
	{

		// iterating while the values of start and end are
		// valid
		while (start <= end) {

		// Finding the midpoint
		int mid = start + (end - start) / 2;
		if (list.get(mid) == key) {
			return mid;
		}
		else if (list.get(mid) > key) {
			end = mid - 1;
		}
		else {
			start = mid + 1;
		}
		}
		return -(start + 1);
	}

	// Driver code
	public static void main(String[] args)
	{
		List<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 20, 6, 4, 5));
		int result = getNumOfInversions(A);
		System.out.println("Number of inversions are "
						+ result);
	}
	}

	// This code is contributed by phasing17




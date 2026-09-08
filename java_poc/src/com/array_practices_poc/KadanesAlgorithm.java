package com.array_practices_poc;

public class KadanesAlgorithm {

	public static void main(String[] args) {
		int[] arr = { 1, 2, -3, 4, 6, -5, 8, 9 };

		int currSum = 0;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			currSum = currSum + arr[i];

			if (currSum > max) {
				max = currSum;
			}

			if (currSum < 0) {
				currSum = 0;
			}
		}

		System.out.println("Max Sum of Sub Arrays : " + currSum);

	}

}

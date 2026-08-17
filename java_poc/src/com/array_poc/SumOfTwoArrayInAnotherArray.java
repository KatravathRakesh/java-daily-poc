package com.array_poc;

public class SumOfTwoArrayInAnotherArray {

	public static void main(String[] args) {
		int[] a1 = { 2, 3, 4, 5 };
		int[] a2 = { 3, 5, 6, 7, 8, 9 };

		int maxLength;

		if (a1.length > a2.length) {
			maxLength = a1.length;
		} else {
			maxLength = a2.length;
		}

		int[] a3 = new int[maxLength];

		for (int i = 0; i < maxLength; i++) {
			int A = 0;
			int B = 0;
			if (i < a1.length) {
				A = a1[i];
			}
			if (i < a2.length) {
				B = a2[i];
			}

			a3[i] = A + B;

		}

		int temp = 0;

//		Arrays.sort(a3);
		
		
//		Sorting Array
		for(int i =0;i<maxLength -1;i++) {
			for(int j=0;j<maxLength-i-1;j++) {
				if(a3[j]>a3[j+1]) {
					temp = a3[j];
					a3[j] = a3[j+1];
					a3[j+1] = temp;
				}
			}
		}

		for (int a : a3) {
			System.out.print(a + " ");
		}

	}

}

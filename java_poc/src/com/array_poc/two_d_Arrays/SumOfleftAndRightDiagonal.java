package com.array_poc.two_d_Arrays;

public class SumOfleftAndRightDiagonal {

	public static void main(String[] args) {
		int[][] num = { { 1, 2, 3 },
				        { 4, 7, 9 }, 
				        { 5, 6, 8 } };
		int lsum = 0;
		int rsum = 0;

		for (int i = 0; i < num.length; i++) {
			int len = num[i].length - 1;
			for (int j = 0; j < num[i].length; j++) {

				if (i == j) {
					lsum += num[i][j];
				}
				if (i == len - j) {
					rsum += num[i][j];
				} 
			}
		}

		System.out.println("Sum of Left Diagonal : " + lsum);
		System.out.println("Sum of Right Diagonal : " + rsum);

	}

}

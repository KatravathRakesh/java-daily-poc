package com.array_poc.two_d_Arrays;

public class SumOfEachCol {

	static void sumOfEachCol(int[][] num) {
		
		for(int i=0;i<num.length;i++) {
			int sum = 0;
			for(int j=0;j<num[i].length;j++) {
				sum += num[j][i];
			}
			System.out.println("Sum Of Each Column : "+i+" : "+sum);
		}
	}
	public static void main(String[] args) {
		int[][] num = { { 1, 2, 7 }, 
				        { 3, 4, 6 },
				        { 5, 8, 9 } };

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		sumOfEachCol(num);

	}

}

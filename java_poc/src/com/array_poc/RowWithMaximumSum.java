package com.array_poc;

import java.util.Scanner;

//Find the row with Maximum and Minimun the highest sum
public class RowWithMaximumSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the row size : ");
		int row = s.nextInt();
		System.out.print("Enter the col size : ");
		int col = s.nextInt();

		int[][] arr = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = s.nextInt();
			}
		}

		String ch;
		int sum = 0;
		int max = 0;
		int min = Integer.MAX_VALUE;
		do {
			sum = 0;
			System.out.print("Enter the which row want to print : ");
			int i = s.nextInt();
			for (int j = 0; j < col; j++) {
				sum += arr[i][j];
			}

			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
			System.out.println("Sum : " + sum);
			if (max < sum) {
				max = sum;

			}
			if (min > sum) {
				min = sum;

			}

			System.out.print("Do you want print another row : ");
			ch = s.next();
		} while (ch.equalsIgnoreCase("yes"));
		System.out.println("Each row Maximum sum : " + max);
		System.out.println("Each row Minimum sum: " + min);

	}

}

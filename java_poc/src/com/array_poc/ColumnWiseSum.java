package com.array_poc;

import java.util.Scanner;

//Find the sum of each column
public class ColumnWiseSum {

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

		System.out.println();

		for (int arr1[] : arr) {
			for (int a : arr1) {
				System.out.print(a + " ");
			}
			System.out.println();
		}

		System.out.println();

		for (int j = 0; j < col; j++) {
			int sum = 0;
			for (int i = 0; i < row; i++) {
				sum += arr[i][j];
			}
			System.out.println("Sum of each col : "+(j+1)+" : "+ sum);

		}
	}

}

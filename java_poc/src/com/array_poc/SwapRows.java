package com.array_poc;

import java.util.Scanner;

//print Swap two rows
public class SwapRows {

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

		System.out.println("Enter the row1 you want swap : ");
		int row1 = s.nextInt();
		System.out.println("Enter the row2 you want swap : ");
		int row2 = s.nextInt();

		for (int j = 0; j < col; j++) {
			int temp = arr[row1][j];
			arr[row1][j] = arr[row2][j];
			arr[row2][j] = temp;
		}

		for (int arr1[] : arr) {
			for (int a : arr1) {
				System.out.print(a + " ");
			}
			System.out.println();
		}

	}

}

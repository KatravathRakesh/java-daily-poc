package com.array_poc.two_d_Arrays;

import java.util.Scanner;

//Print all elements of a 2D array
//{{1,2},{3,4}} → 1 2 3 4

// Sum of RightDiagonal And Left diagonal

public class SumOfAllElement {

	static int sumOfAllElement(int[][] num) {
		int sum = 0;

		// Sum of All Element
		for (int n1[] : num) {
			for (int n2 : n1) {
				sum += n2;
			}

		}

		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the row size : ");
		int row = s.nextInt();
		System.out.print("Enter the col size : ");
		int col = s.nextInt();

		int[][] num = new int[row][col];

		System.out.println("Enter the 2D Array Elements : ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				num[i][j] = s.nextInt();
			}
			System.out.println();
		}

		System.out.println();

		for (int n1[] : num) {
			for (int n2 : n1) {
				System.out.print(n2 + " ");
			}
			System.out.println();
		}

		int sum = sumOfAllElement(num);
		System.out.println("Sum of All Element in 2D Arrays : " + sum);
		
		s.close();

	}
	

}

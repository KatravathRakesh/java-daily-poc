package com.array_poc.two_d_Arrays;

//Q).Write a Java program to perform the following operations on a 3 × 3 integer matrix:
//Reverse the elements of every even-indexed row (rows 0 and 2).
//Multiply every element of the odd-indexed row (row 1) by 2, except the middle element (1,1).
//Square all the elements on the main (left) diagonal.
//Test Case 1
//Input:
//1 2 3
//4 5 6
//7 8 9
//
//Expected Output:
//9  2  1
//8  25  12
//9  8  49

public class MatrixOperations {

	static void matrixOperation(int[][] matrix) {
		

		for (int i = 0; i < matrix.length; i++) {
			int temp = 0;
			int start = 0;
			int end = matrix.length - 1;
			for (int j = 0; j < matrix[i].length; j++) {
				if (i % 2 == 0) {
					while (start < end) {
						temp = matrix[i][start];
						matrix[i][start] = matrix[i][end];
						matrix[i][end] = temp;

						start++;
						end--;
					}
				}else if(i%2 != 0 && i != j) {
					matrix[i][j] *= 2;
				}
				
				if(i == j) {
					matrix[i][j] = matrix[i][j]*matrix[i][j];
				}
			}
			System.out.println();
		}

		System.out.println("After Modifing Matrix : ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 },
				           { 4, 5, 6 }, 
				           { 7, 8, 9 } };

		System.out.println("Given Matix : ");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		matrixOperation(matrix);

	}

}

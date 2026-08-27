package com.array_poc.two_d_Arrays;


//Test Case 4 — Mixed positive numbers
//
//Input:
//
//10 21 32
//43 54 65
//76 87 98
//
//Expected Output:
//
//0  -1   0
//-1   0  -1
// 0  -1   0
//
//Purpose: Checks alternating even and odd values.

public class ReplaceEvenOddMatrix {

	static void replaceEvenOddElement(int[][] matrix) {
		
		System.out.println("After Changing Matrix  : ");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]%2 == 0) {
					matrix[i][j] = 0;
				}else {
					matrix[i][j] = -1;
				}
			}
		}
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		
	}
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 },
		                   { 4, 5, 6 }, 
		                   { 7, 8, 9 } };
		
		System.out.println("Before Changing Matrix  : ");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		replaceEvenOddElement(matrix);
		

	}

}

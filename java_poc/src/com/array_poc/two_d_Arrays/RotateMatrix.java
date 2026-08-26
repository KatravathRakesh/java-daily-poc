package com.array_poc.two_d_Arrays;

//Bottom → Top for each column.
//
//Original          Rotated
//
//1 2 3              7 4 1
//4 5 6      →       8 5 2
//7 8 9              9 6 3
public class RotateMatrix {

	
	static void rotateMatrix(int[][] matrix) {
		System.out.println("After Matrix Rotation : ");
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[matrix.length-j-1][i]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},
				          {4,5,6},
				          {7,8,9}};
		
		System.out.println("Befor Given Matrix : ");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println();
		rotateMatrix(matrix);
	}

}

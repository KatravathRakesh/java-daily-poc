package com.array_poc.two_d_Arrays;

public class SpiralMatrix {

	static void spiralMatrix(int[][] matrix) {
		
		
		
		int startRow = 0;
		int endRow = matrix.length-1;
		int startCol = 0;
		int endCol = matrix[0].length-1;
		
		while(startRow <= endRow && startCol <= endCol ) {
//			Right
			for(int j=startCol; j<=endCol;j++) {
				System.out.print(matrix[startRow][j]+" ");
			}
			
//			Down
			for(int i=startRow+1;i<=endRow;i++) {
				
				System.out.print(matrix[i][endCol]+" ");
			}
			
//			Left
			for(int j=endCol-1;j>= startCol;j--) {
				if(startCol == endCol) {
					break;
				}
				System.out.print(matrix[endRow][j]+" ");
			}
			
//			Up
			for(int i=endRow-1;i>startRow;i--) {
				if(startRow == endRow) {
					break;
				}
				System.out.print(matrix[i][startCol]+" ");
			}
			startRow++;
			startCol++;
			endRow--;
			endCol--;
			
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

		System.out.print("Spiral Matrix : ");
		spiralMatrix(matrix);
	}

}

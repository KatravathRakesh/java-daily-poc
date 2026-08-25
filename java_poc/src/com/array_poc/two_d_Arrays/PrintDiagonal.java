package com.array_poc.two_d_Arrays;

public class PrintDiagonal {

	static void printDiagonal(int[][] num) {
		
		System.out.println("Printed Diagonal : ");
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				if(i == j) {
					System.out.print(num[i][j]+" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		int[][] num = {{1,2,3},
				       {4,5,6},
				       {7,8,9}};
		
		for(int n1[] : num) {
			for(int n2 : n1) {
				System.out.print(n2+" ");
			}
			System.out.println();
		}

		System.out.println();
		
		printDiagonal(num);
	}

}

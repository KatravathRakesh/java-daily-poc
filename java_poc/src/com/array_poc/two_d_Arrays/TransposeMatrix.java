package com.array_poc.two_d_Arrays;

public class TransposeMatrix {

	static void transposeMatrix(int[][] num) {
		
		System.out.println("Transpose Matrix : ");
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[j][i]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		int[][] num = {{1,2,3},
				       {4,5,6},
				       {7,8,9}};
		
		for(int n2[] : num) {
			for(int n1: n2) {
				System.out.print(n1+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		transposeMatrix(num);
		

	}

}

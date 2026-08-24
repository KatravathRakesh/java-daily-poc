package com.array_poc.two_d_Arrays;

public class ColumnWisePrint {

	static void colWisePrint(int[][] num) {
		System.out.println("Print Column wise Element : ");
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[j][i]+" ");
			}
			System.out.println();
		}
		
		
	}
	public static void main(String[] args) {
		int[][] num = { { 1, 2 }, { 3, 4 } };

		for (int n1[] : num) {
			for (int n2 : n1) {
				System.out.print(n2 + " ");
			}
			System.out.println();
		}
		System.out.println();

		colWisePrint(num);

	}

}

package com.array_poc.two_d_Arrays;

//Print row-wise elements
//{{1,2},{3,4}} → 1 2 / 3 4
public class RowWisePrint {

	static void rowWisePrint(int[][] num) {
		System.out.println("Print Row wise Element : ");
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] num = {{1,2},
				       {3,4}};
		
		for(int n1[] : num) {
			for(int n2 : n1) {
				System.out.print(n2+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		rowWisePrint(num);
		
		

	}

}

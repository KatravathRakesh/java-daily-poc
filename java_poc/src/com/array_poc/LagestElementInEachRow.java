package com.array_poc;

public class LagestElementInEachRow {

	static void lagrestElementOfEachRow(int[][] num) {
		
		for(int i=0;i<num.length;i++) {
			int lar = num[0][0];
			for(int j=0;j<num[i].length;j++) {
				if(lar < num[i][j]) {
					lar = num[i][j];
				}
			}
			System.out.println("Largest Element Of Each Row : "+i+" : "+lar);
			
		}
	}
	public static void main(String[] args) {
		int[][] num = { { 1, 2, 7 }, 
		                { 3, 6, 4 },
		                { 9, 8, 5 } };
		
		for(int n1[] : num) {
			for(int n2 : n1) {
				System.out.print(n2+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		lagrestElementOfEachRow(num);

	}

}

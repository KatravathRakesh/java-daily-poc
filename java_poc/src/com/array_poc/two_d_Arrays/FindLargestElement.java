package com.array_poc.two_d_Arrays;

//Find largest element
//{{5,2},{9,4}} → 9
public class FindLargestElement {

	static int findlargestNum(int[][] num) {
		int largestNum = num[0][0];
		
		for(int n1[] : num) {
			for(int n2 : n1) {
				if(largestNum < n2) {
					largestNum = n2;
				}
			}
		}
		
		return largestNum;
	}
	public static void main(String[] args) {
		int[][] num = { { 1, 2, 3 }, 
				        { 4, 7, 9 }, 
				        { 5, 6, 8 } };
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		int lar = findlargestNum(num);
		System.out.println("Largest Number in Given Array : "+ lar);
		

	}

}

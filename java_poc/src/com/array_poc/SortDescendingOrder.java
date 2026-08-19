package com.array_poc;

public class SortDescendingOrder {

	static void descendingOrder(int[] num) {
		int start =0;
		int end = num.length-1;
		int temp = 0;
		
		while(start < end) {
			int i = start + 1;
			
			while(i <= end) {
				if(num[start]<num[i]) {
					temp = num[start];
					num[start] = num[i];
					num[i] = temp;
				}
				i++;
			}
			start++;
		}
		
		System.out.print("Descending Order : ");
		for(int n: num) {
			System.out.print(n+" ");
		}
	}
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5,6,7,8,9};
		
		descendingOrder(num);

	}

}

package com.array_poc;

public class SortAscendingOrder {

	static void ascendingOrder(int[] num) {
		int start = 0;
		int end = num.length - 1;
		int temp = 0;

		while (start < end) {
			int i = start + 1;
			
			while(i <= end) {
				if(num[start] > num[i]) {
					temp = num[start];
					num[start] = num[i];
					num[i] = temp;
				}
				i++;
			}
			start++;

		}

		System.out.print("Ascending Order : ");
		for (int n : num) {
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		int[] num = { 9,8,7,6,5,4,3,2,1};

		ascendingOrder(num);

	}

}

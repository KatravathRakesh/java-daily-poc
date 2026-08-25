package com.array_poc;

import java.util.Arrays;

public class FindLeaderElement {

	static void findLeaderElement(int[] num) {
		System.out.println("Leader Element in Given Arrays : ");

		for (int i = 0; i < num.length; i++) {
			boolean flag = true;
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] <= num[j]) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				System.out.print(num[i]+" ");
			}
		}

	}

	public static void main(String[] args) {
		int[] num = { 16, 17, 4, 3, 5, 2 };

		System.out.println(Arrays.toString(num));
		System.out.println();

		findLeaderElement(num);

	}

}

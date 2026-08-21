package com.array_poc;

import java.util.Arrays;

public class RemoveDuplicatePrintSortArray {

	static void sortNum(int[] num) {
		int temp = 0;

		for (int i = 0; i < num.length - 1; i++) {
			boolean flag = false;
			for (int j = 0; j < num.length - i - 1; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
					flag = true;
				}
			}
			if (!flag) {
				break;
			}

		}

		System.out.println(" Before remove Duplicate Sort Array : " + Arrays.toString(num));
	}

	static void removeDuplicate(int[] num) {

		System.out.print(" After remove Duplicate Sort Array : ");
		for (int i = 0; i < num.length; i++) {
			if (i < num.length - 1 && num[i] == num[i + 1]) {
				continue;
			}
			System.out.print(num[i] + " ");
		}

	}

	public static void main(String[] args) {
		int[] num = { 2, 3, 5, 1, 9, 2, 4, 8 };

		sortNum(num);
		System.out.println();
		removeDuplicate(num);

	}

}

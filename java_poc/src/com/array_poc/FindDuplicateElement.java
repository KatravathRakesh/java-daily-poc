package com.array_poc;

import java.util.Scanner;

public class FindDuplicateElement {

	static void findDuplicateElement(int[] num) {
		int count = 0;
		

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					count = 0;
					
					for(int k=0;k<i;k++) {
						if(num[i] == num[k]) {
							count++;
						}
					}
					if (count  == 0 ) {
						System.out.print(num[i]+" ");
					}
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = { 10, 20, 10, 30, 10, 20 };

		findDuplicateElement(num);

	}

}

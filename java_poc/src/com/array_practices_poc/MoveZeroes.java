package com.array_practices_poc;

import java.util.Arrays;

public class MoveZeroes {

	static void moveZeroEnd(int[] arr) {
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j] != 0) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						break;
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 3, 12};
		
		moveZeroEnd(arr);
	}

}

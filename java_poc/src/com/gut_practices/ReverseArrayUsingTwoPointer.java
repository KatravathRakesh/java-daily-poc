package com.gut_practices;

import java.util.Arrays;

public class ReverseArrayUsingTwoPointer {

	static void reverse(int[] arr) {
		int temp = 0;
		int si = 0;
		int ei = arr.length - 1;

		while (si < ei) {
			if (arr[si] < arr[ei]) {
				temp = arr[si];
				arr[si] = arr[ei];
				arr[ei] = temp;

			}
			si++;
			ei--;
		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println("Befor Reverse Array :" + Arrays.toString(arr));
		reverse(arr);
		System.out.println("After Reverse Array :" + Arrays.toString(arr));

	}

}

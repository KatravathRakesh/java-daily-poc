package com.array_practices_poc;

import java.util.Arrays;

public class SelectionSort {

	static void selectionSort(int[] arr) {
		int temp =0;
		for(int i=0;i<arr.length;i++) {
			int minidx = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] <arr[minidx]) {
					minidx = j;
				}
			}
			
			temp = arr[i];
			arr[i] = arr[minidx];
			arr[minidx] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr = { 8, 4, 5, 2, 9, 7, 1 };

		selectionSort(arr);

	}

}

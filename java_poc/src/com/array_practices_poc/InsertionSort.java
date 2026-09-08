package com.array_practices_poc;

import java.util.Arrays;

public class InsertionSort {

	static void insertionSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int temp = arr[i];
			int j = i;
			
			while(j> 0 && arr[j-1]> temp) {
				arr[j] = arr[j-1];
				j = j-1;
			}
			
			arr[j] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr = {9,2,7,1,8};
		
		insertionSort(arr);

	}

}

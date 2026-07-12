package com.array_poc;

import java.util.Arrays;

public class Insertion_Sort {
	public static void insertSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];// store value
			int j = i;// store index
			
			while(j>0 && arr[j-1] > temp) {
				arr[j] = arr[j-1];
				j = j-1;
			}
			
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}
	public static void main(String[] args) {
		int [] arr = { 30, 20, 1,40,3, 5};
		
		insertSort(arr);
	}

}

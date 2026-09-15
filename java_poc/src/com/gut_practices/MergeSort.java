package com.gut_practices;

import java.util.Arrays;

public class MergeSort {

	public static void divide(int[] arr) {
		// base case
		if (arr.length <= 1) {
			return;
		}

		int[] left = new int[arr.length / 2];// for left side array size
		int[] right = new int[arr.length - left.length];// for right side array size

		int i;
		// to insert value in left array
		for (i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}

		// to insert value in right array
		for (int j = 0; j < right.length; j++) {
			right[j] = arr[i++];
		}

		divide(left);
		divide(right);
		mergeSort(arr, left, right);

	}

	static void mergeSort(int[] arr, int[] left, int[] right) {
		int i=0;
		int j=0;
		int k =0;
		//for sorting after dividing 
		while(i<left.length && j <right.length) {
			if(left[i] < right[j]) {
				arr[k++]= left[i++];
			}else {
				arr[k++]= right[j++];
			}
		}
		
		while(i<left.length) {
			arr[k++]= left[i++];
		}
		while(j<right.length) {
			arr[k++]= right[j++];
		}
	}

	public static void main(String[] args) {
		int[] arr = { 38, 27, 43, 3, 9, 82, 10 };

		System.out.println("Before Merge sort :"+Arrays.toString(arr));
		divide(arr);
		System.out.println("After Merge sort :"+Arrays.toString(arr));

	}

}

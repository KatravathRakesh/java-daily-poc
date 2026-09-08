package com.array_practices_poc;

import java.util.Arrays;

public class BubbleSort {

	static void bubbleSort(int[] arr) {
		int temp = 0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr = {8,4,5,2,9,7,1};
		
		bubbleSort(arr);

	}

}

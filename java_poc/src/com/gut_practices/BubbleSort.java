package com.gut_practices;

import java.util.Arrays;

public class BubbleSort {

	static void bubbleSort(int[] arr) {
		int temp = 0;
		for(int i =0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println();
		
		System.out.println("After Sorting Array : "+Arrays.toString(arr));
		
	}
	public static void main(String[] args) {
		int[] arr = {5, 3, 8, 4, 2};
		
		System.out.println("Before Sort Array : "+Arrays.toString(arr));
		bubbleSort(arr);
	}

}

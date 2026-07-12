package com.array_poc;

import java.util.Arrays;

public class Selection_sort {

	public static void selectSort(int [] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int [] arr = { 30 ,10, 20, 4, 40, 3,2};
		
		selectSort(arr);

	}

}

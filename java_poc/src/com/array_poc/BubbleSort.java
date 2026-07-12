package com.array_poc;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j] > arr[j+1]) { // 20 > 10 --true, 
					int temp = arr[j]; 
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		//  or
		
//		for(int arr1 : arr) {
//			System.out.print(arr1+" ");
//		}
		
	}
	
	public static void main(String[] args) {
		int[] arr = { 20,10,3,6,34,2};
		
		bubbleSort(arr);
	}

	
}

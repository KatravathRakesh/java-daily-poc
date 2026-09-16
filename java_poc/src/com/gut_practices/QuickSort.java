package com.gut_practices;

import java.util.Arrays;

///
/// 10, 7, 8, 9, 1, 5
public class QuickSort {

	
	static int divide(int[] arr,int low, int high) {
//		choose pivot element
		int temp =0;
		int pivot = arr[high];
		
		int i = low-1;
		for(int j=low;j<high;j++) {
			
			if(arr[j]< pivot) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		return i+1;
		
	}
	
	static void quickSort(int[] arr,int low ,int high) {
		
		if(low < high) {
			int pi = divide(arr,low,high);
			
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,high);
		}
	}
	public static void main(String[] args) {
		int[] arr = { 10, 7, 8, 9, 1, 5};
		int n = arr.length;
		quickSort(arr,0,n-1);
		
		System.out.println(" Quict sort :" +Arrays.toString(arr));
	}

}

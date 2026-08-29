package com.recursion;

public class CheckSortArray {

	static boolean isArraySort(int[] arr,int i) {
		if(i == arr.length-1) {
			return true;
		}
		if(arr[i] > arr[i+1]) {
			return false;
		}
		
		return isArraySort(arr,i+1);
	}
	public static void main(String[] args) {
		int[] arr = {1,5,3,4};
		int i=0;
		if(isArraySort(arr,i)) {
			System.out.println("Given Array is  Sorted");
		}else {
			System.out.println("Given Array is Not Sorted");
		}
	}

}

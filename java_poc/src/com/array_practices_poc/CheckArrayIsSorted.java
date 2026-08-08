package com.array_practices_poc;

import java.util.Arrays;

public class CheckArrayIsSorted {
	static boolean isArraySorted(int[] arr) {
		boolean flag = true;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] > arr[i+1]) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,9,3,4,6};
		
		if(isArraySorted(arr)) {
			System.out.println("Given Array is Sorted Order : "+Arrays.toString(arr));
		}else {
			System.out.println("Given Array is not in Sorted Order : "+Arrays.toString(arr));
		}
	}

}

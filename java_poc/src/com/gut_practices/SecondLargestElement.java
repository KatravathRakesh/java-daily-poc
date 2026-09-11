package com.gut_practices;

import java.util.Arrays;

public class SecondLargestElement {

	static int findScoendLargest(int[] arr) {
		int max = 0;
		int secMax = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			 if(arr[i] == max) {
				 continue;
			 }else if(arr[i] > secMax) {
				 secMax = arr[i];
			 }
		}
		
		return secMax;
	}
	public static void main(String[] args) {
		int[] arr = {12, 45, 67, 23, 89, 54};
		
		System.out.println("Arrays : "+Arrays.toString(arr));
		
		int secMax = findScoendLargest(arr);
		System.out.println("Second Maximum Element in Array : "+secMax);

	}

}

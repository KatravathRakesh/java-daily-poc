package com.array_practices_poc;

public class TwoSumArray {

	static int[] twoSum(int[] arr, int target) {
		for(int i =0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] + arr[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		
		return new int[] {};
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] arr1 = twoSum(arr,7);
		
		System.out.print("Index of Array sumed : ");
		for(int i=0;i<2;i++) {
			System.out.print(arr1[i]+" ");
		}

	}

}

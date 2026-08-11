package com.array_practices_poc;

public class RemoveDuplicatesfromSortedArray {

	static void removeDuplicate(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] != arr[j]) {
					
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {1, 1, 2, 2, 3, 4, 4};
		
		removeDuplicate(arr);
	}

}

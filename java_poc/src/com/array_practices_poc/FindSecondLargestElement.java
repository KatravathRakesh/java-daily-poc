package com.array_practices_poc;

public class FindSecondLargestElement {

	static void findSecondLarElement(int[] arr) {
		int max = arr[0];
		int SecondLargest = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] > max) {
				SecondLargest = max;
				max = arr[i];
			}else if(arr[i] > SecondLargest && arr[i] != max) {
				SecondLargest = arr[i];
			}
		}
		
		System.out.println("Maximum Element : "+SecondLargest);
	}
	public static void main(String[] args) {
		int[] arr = {10,2,6,15,8,20};
		
		findSecondLarElement(arr);
	}

}

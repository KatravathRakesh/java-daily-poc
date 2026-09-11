package com.gut_practices;


public class SelectionSort {

	static void sort(int[] arr) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			int minIdx = i;
			for(int j= i+1;j<arr.length;j++) {
				if(arr[j]< arr[minIdx]) {
					minIdx = j;
				}
			}
			
			if(i != minIdx) {
				temp = arr[i];
				arr[i] = arr[minIdx];
				arr[minIdx] = temp;
			}
		}
		
		for(int n  : arr) {
			System.out.print(n+" ");
		}
		
//		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr = {5,2,3,4,1};
		
		sort(arr);

	}

}

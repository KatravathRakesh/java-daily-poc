package com.array_poc;

import java.util.Arrays;

public class MoveAllZeroAtEnd {

	static void movieZero(int[] arr) {
		int j=0;
		int temp =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0) {
			    temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 3, 12};
		
		movieZero(arr);

	}

}

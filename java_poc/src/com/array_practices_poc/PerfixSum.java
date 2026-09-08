package com.array_practices_poc;

import java.util.Arrays;

public class PerfixSum {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		
		int[] perfix = new int[arr.length];
		
		perfix[0] = arr[0];
		
		for(int i = 1;i < arr.length;i++) {
			perfix[i] = perfix[i-1]+arr[i];
		}

		
		System.out.println(Arrays.toString(perfix));
	}

}

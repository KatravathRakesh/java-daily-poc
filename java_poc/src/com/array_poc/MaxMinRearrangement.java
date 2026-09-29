package com.array_poc;

import java.util.Arrays;

public class MaxMinRearrangement {

	public static void MaxMin(int[] nums) {

		int si = 0;
		int ei = nums.length - 1;

		int[] result = new int[nums.length];

		int i = 0;
		while (i < result.length) {
			result[i] = nums[ei];
			result[i + 1] = nums[si];
			i = i + 2;
			ei--;
			si++;
		}

		for (int j = 0; j < nums.length; j++) {
			nums[j] = result[j];
		}
		
		System.out.println(Arrays.toString(nums));

	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6 };

		MaxMin(nums);
	}

}

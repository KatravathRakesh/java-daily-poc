package com.array_poc;

public class FindLeaderElements {

	public static void findElement(int[] nums) {

//		Time Complexity : O(n)
		for (int i = 0; i < nums.length-1; i++) {
			boolean flag = true;
			if (nums[i] <= nums[i+1]) {
				flag = false;
			}

			if (flag) {
				System.out.print(nums[i] + " ");
			}
		}

	}

	public static void main(String[] args) {
		int[] nums = { 16, 17, 4, 3, 5, 2 };

		findElement(nums);

	}

}

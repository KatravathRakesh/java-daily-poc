package com.array_poc;

public class CheckArray_is_sort_in_ascOrder {

	public static boolean isAscendingOrder(int[] nums) {
		boolean flag = true;
		
		int si = 0;
		int ei = nums.length-1;
		
		while(si<ei) {
			if(nums[si] <= nums[si+1]) {
				si++;
			}else {
				flag = false;
				break;
			}
			
		}
		return flag;
	}
	public static void main(String[] args) {
		int[] nums = {10, 20, 30, 40, 50};
		
		System.out.println("Is Given Array is Sorted : "+isAscendingOrder(nums));
	}

}

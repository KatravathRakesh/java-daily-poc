package com.array_practices_poc;
import java.util.Arrays;

public class CheckPalindromeArray {

	static boolean isPalindrome(int[] arr) {
		boolean flag = true;
		int left =0;
		int right = arr.length-1;
		
		while(left < right) {
			if(arr[left] != arr[right]) {
				flag = false;
			}
			left++;
			right--;
		}
		
		return flag;
	}
	public static void main(String[] args) {
		int[] arr = {1,3,2,3,1};
		
		if(isPalindrome(arr)) {
			System.out.println("Given Array is Palindrome : "+Arrays.toString(arr));
		}else {
			System.out.println("Given Array is Not Palindrome : "+Arrays.toString(arr));
		}

	}

}

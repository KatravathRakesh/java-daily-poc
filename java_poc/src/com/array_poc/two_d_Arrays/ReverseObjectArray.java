package com.array_poc.two_d_Arrays;

public class ReverseObjectArray {

	public static void reverse(Object[] arr) {
		
		for(int i= arr.length-1;i>=0;i--) {
			if(arr[i] instanceof Object[]) {
				reverse((Object[])arr[i]);
			}else {
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		Object[] arr = {
	            10,
	            new Object[]{20, 30},
	            40,
	            new Object[]{50, new Object[]{60, 70}}
	        };
		
		reverse(arr);

	}

}

package com.array_practices_poc;

public class MinAndMaxElement {

	public static void main(String[] args) {
		int[] arr = {10, 5, 20, 8, 15};
		
		int min = arr[0];
		int max = arr[0];
		
		for(int a: arr) {
			if(a < min) {
				min = a;
			}else if(a > max) {
				max =a;
			}
		}
		
		System.out.println("Minimum Element : "+min);
		System.out.println("Maximum Element : "+max);
	}

}

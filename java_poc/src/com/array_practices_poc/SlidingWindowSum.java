package com.array_practices_poc;

public class SlidingWindowSum {

	public static void main(String[] args) {
		int[] arr = {10,23,4,18,9,28};
		
		int day = 3;// how many move
		
		int sum = 0;
		int avg = 0;
		
		for(int i=0;i<day;i++) {
			sum = sum+ arr[i];
			avg = sum/day;
		}
		
		System.out.println("Window Sum : "+ sum+" avg : "+avg);
		
		for(int i=1;i<=arr.length-day;i++) {
			sum = sum - arr[i-1] + arr[i+day-1];
			avg = sum/day;
			System.out.println("Window Sum : "+ sum+" avg : "+avg);
		}

	}

}

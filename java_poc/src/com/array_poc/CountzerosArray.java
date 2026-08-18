package com.array_poc;

import java.util.Arrays;

public class CountzerosArray {

	static int countZero(int[] num) {
		int count = 0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i] == 0) {
				count++;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		int[] num =  {11,30,0,32,78,0,67,0};
		
		int count = countZero(num);
		
		System.out.println(Arrays.toString(num));
		
		System.out.println("Total Number Zeros is : "+count);

	}

}

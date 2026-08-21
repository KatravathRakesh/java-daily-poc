package com.array_poc;

import java.util.Arrays;

public class FindMissingNumber {

	static void sortNum(int[] num) {
		int temp = 0;
		
		for(int i=0;i<num.length-1;i++) {
			boolean flag = false;
			for(int j=0;j<num.length-i-1;j++) {
				if(num[j] > num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
					flag = true;
					
				}
			}
			if(!flag) {
				break;
			}
		}
		
		System.out.println("Sorted Arrays : "+Arrays.toString(num));
	}
	
	static int findMissingNum(int[] num) {
		int temp = 0;
		boolean flag = false;
		for(int i = 0;i<num.length-1;i++) {
			for(int j=0;j<num.length-i-1;j++) {
				if(num[j+1]-num[j] == 1) {
					flag = true;
				}else {
					temp =  num[j]+1;
					break;
				}
			}
		}
		
		return temp;
		
	}
	public static void main(String[] args) {
		int[] num = {8,9,3,2,5,4,6,1};
		
		
		sortNum(num);
		System.out.println();
		int missing = findMissingNum(num);
		System.out.println("Missing Number is : "+missing);

	}

}



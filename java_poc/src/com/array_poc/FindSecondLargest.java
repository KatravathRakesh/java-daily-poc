package com.array_poc;

public class FindSecondLargest {

	static int findSecondMax(int[] num) {
		
		int max = num[0];
		int secmax = num[0];
		
		for(int i=1;i<num.length;i++) {
			if(max < num[i]) {
				max = num[i];
			}
		}
		
		for(int i=0;i<num.length;i++) {
			if(max == num[i]) {
				continue;
			}else if(secmax < num[i]) {
				secmax = num[i];
			}
		}
		
		return secmax;
		
	}
	public static void main(String[] args) {
		int[] num = {20,30,50,80,90,70,100};
		
		System.out.println("Seconed Largest Number :" +findSecondMax(num));

	}

}

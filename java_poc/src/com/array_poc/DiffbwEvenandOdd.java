package com.array_poc;

import java.util.Arrays;
import java.util.Scanner;

public class DiffbwEvenandOdd {

	static void diffEvenandOdd(int[] num) {
		int sumEven = 0;
		int sumOdd = 0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%2 == 0) {
				sumEven += num[i];
			}else {
				sumOdd += num[i];
			}
		}
		
		int diff = sumEven - sumOdd;
		
		System.out.println("Different Between Even and Odd Number : "+diff);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(Arrays.toString(num));
		
		diffEvenandOdd(num);
		
		s.close();

	}

}

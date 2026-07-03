package com.for_loop_poc;

import java.util.Scanner;

//Find the sum of the first N natural numbers.
public class SumOfNNumbersFor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the num : ");
		int n = s.nextInt();
		
		int sum =0;
		for(int i=0;i<=n;i++) {
			sum += i;
		}
		
		System.out.println("Sum of N number : "+sum);
	}

}

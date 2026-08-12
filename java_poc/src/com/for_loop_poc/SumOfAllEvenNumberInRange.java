package com.for_loop_poc;

import java.util.Scanner;

public class SumOfAllEvenNumberInRange {
	
	static int sumOfEvenNum(int n) {
		int sum = 0;
		for(int i=0;i<=n;i++) {
			if(i%2 == 0) {
				sum += i;
			}
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter How many number want to print : ");
		int n =s.nextInt();
		
		int sum = sumOfEvenNum(n);
		System.out.println("Sum of All Even Number in given Range is : "+sum);
		s.close();

	}

}

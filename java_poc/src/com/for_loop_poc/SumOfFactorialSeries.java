package com.for_loop_poc;

import java.util.Scanner;

//Example for N = 4:
//
//1! + 2! + 3! + 4! + 5!
//
//= 1 + 2 + 6 + 24 + 120
//
//= 153
public class SumOfFactorialSeries {

	static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		
		return fact;

	}

	static int sumOffactseries(int n) {
		int sum = 0;
		
		for(int i=1;i<=n;i++) {
			sum += factorial(i);
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter how many number want to print : ");
		int n = s.nextInt();

		int sum = sumOffactseries(n);
		System.out.println("Sum Of Factorial Series of Given number "+n+" is : "+sum);
		
		sumOffactseries(n);
		s.close();
	}

}

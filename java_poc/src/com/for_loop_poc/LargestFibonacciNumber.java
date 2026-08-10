package com.for_loop_poc;

import java.util.Scanner;

public class LargestFibonacciNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("How may  fibonaccu serier number want to print :");
		int n = s.nextInt();

		FibonacciSeries(n);
		System.out.println();
		findLargetFibNumber(n);
		
		s.close();

	}

	static void FibonacciSeries(int n) {
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1 + " " + n2 + " ");
		int n3 = 0;
		for (int i = 2; i <= n - 2; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
	}
	
	static void findLargetFibNumber(int n) {
		int n1 = 0;
		int n2 = 1;
		int max = 0;
		int n3 = 0;
		for (int i = 2; i <= n - 2; i++) {
			n3 = n1 + n2;
			if(max < n3) {
				max = n3;
			}
			n1 = n2;
			n2 = n3;
		}
		
		System.out.println("Largest Fibonacci Number : "+max);
	}

}

package com.for_loop_poc;

import java.util.Scanner;

public class TargetFibonacciNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("how many Fibonacco Series want to print : ");
		int n = s.nextInt();
		System.out.println("Fibonacci Series : ");
		FibonacciSeries(n);

		System.out.println();
		TargetFibIndex(n);
		
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

	static void TargetFibIndex(int n) {
		Scanner s = new Scanner(System.in);
		int n1 = 0;
		int n2 = 1;
		System.out.print("Enter the Target Number  : ");
		int target = s.nextInt();
		int n3 = 0;
		for (int i = 2; i <= n - 2; i++) {
			n3 = n1 + n2;
			if(target == n3) {
				System.out.println("Give target Number is Found in Fibonacci Series : "+target);
				break;
			}
			n1 = n2;
			n2 = n3;

		}

	}

}

package com.for_loop_poc;

import java.util.Scanner;

public class EvenIndexFibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("how many Fibonacco Series want to print : ");
		int n = s.nextInt();
		System.out.println("Fibonacci Series : ");
		FibonacciSeries(n);

		System.out.println();
		System.out.println("Fibonacci Series Even index : ");
		EvenFibIndex(n);
		s.close();

	}

	static void FibonacciSeries(int n) {
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1 + " " + n2 + " ");
		int n3 = 0;
		for (int i = 2; i <= n-2; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}

	}

	static void EvenFibIndex(int n) {
		int n1 = 0;
		int n2 = 1;
		int FibIndex = 2;
		System.out.print(n1 + " ");
		int n3 = 0;
		for (int i = 2; i <= n-2; i++) {
			n3 = n1 + n2;
			if (FibIndex % 2 == 0) {
				System.out.print(n3 + " ");
			}
			n1 = n2;
			n2 = n3;
			FibIndex++;
		}

	}

}

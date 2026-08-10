package com.for_loop_poc;

import java.util.Scanner;

// 0  1  1  2  3  5  8  13  21  34  55
//n1 n2  
//n1+n2=n3 
public class PrintFibonacciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("how many Fibonacco Series want to print : ");
		int n = s.nextInt();

		System.out.println("Fibonacci Series : ");
		FibonacciSeries(n);

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

}

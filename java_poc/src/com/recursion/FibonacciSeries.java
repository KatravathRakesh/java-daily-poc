package com.recursion;

import java.util.Scanner;

///0  1  1   2  3  5  8 13 21 34 55
// n1 n2 n3
//    n1 n2 n3
//       n1 n2 n3
/// n3 = n1 + n2

public class FibonacciSeries {

	public static int fib(int n) {
//		base case 
		if(n == 0 || n == 1) {
			return n;
		}
		return fib(n-1) + fib(n-2);
	}
	static void printSeries(int n, int i) {
//		base case
		if(i>n) {
			return;
		}
		
		System.out.print(fib(i)+" ");
		printSeries(n,i+1);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many number want to Print : ");
		int n = s.nextInt();
		
		fib(n);
		printSeries(n,0);
		
		s.close();

	}

}

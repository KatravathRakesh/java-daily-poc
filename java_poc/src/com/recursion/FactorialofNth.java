package com.recursion;

import java.util.Scanner;

public class FactorialofNth {

	public static int fact(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many number want to print : ");
		int n = s.nextInt();

		int fact = fact(n);
		System.out.println("Factorial of "+n+"th Number : "+fact);

		s.close();

	}

}

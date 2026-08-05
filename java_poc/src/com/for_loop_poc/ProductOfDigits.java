package com.for_loop_poc;

import java.util.Scanner;

public class ProductOfDigits {

	static int ProductDigits(int n) {
		int digit = 0;
		int product = 1;

		for (int i = n; i > 0; i = i / 10) {
			digit = i % 10;
			product *= digit;
		}
		return product;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();

		int result = ProductDigits(n);
		System.out.println("Product of Digits : " + result);
		s.close();
	}
	

}

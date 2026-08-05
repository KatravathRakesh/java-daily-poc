package com.for_loop_poc;

import java.util.Scanner;

public class ReverseNumber {

	static int reverse(int n) {
		int digit = 0;
		int reverse = 0;

		for (int i = n; i > 0; i = i / 10) {
			digit = i % 10;// 123 -> 3
			reverse = (reverse * 10) + digit;

		}

		return reverse;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();

		int result = reverse(n);
		System.out.println("Reverse Number : " + result);
		
		
	}

}

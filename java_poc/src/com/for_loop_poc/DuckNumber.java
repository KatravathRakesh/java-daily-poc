package com.for_loop_poc;

import java.util.Scanner;

//Duck number is a number that contains at least one 0, but the first digit should not be 0.
//1025 
//Contains 0 ✔
//So, 1023 is a Duck number.
public class DuckNumber {
	static boolean isDuck(int n) {
		boolean flag = false;
		int digit = 0;
		for (int i = n; i > 0; i = i / 10) {
			digit = i % 10;
			if (digit == 0) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();

		if (isDuck(n)) {
			System.out.println("Given Number is a Duck Number :" + n);
		} else {
			System.out.println("Given Number is not a Duck Number :" + n);
		}
		s.close();

	}

}

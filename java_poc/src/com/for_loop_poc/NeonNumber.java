package com.for_loop_poc;

import java.util.Scanner;

//9² = 81
//
//8 + 1 = 9
public class NeonNumber {

	static boolean isNeon(int n) {
		boolean flag = false;
		int sq = n * n;// 9*9 => 81
		int digit = 0;
		int sum = 0;

		for (int i = sq; i > 0; i = i / 10) {
			digit = i % 10;
			sum += digit;
		}

		if (sum == n) {
			flag = true;
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();

		if (isNeon(n)) {
			System.out.println("Given Number is Nean Number :" + n);
		} else {
			System.out.println("Given Number is not Nean Number :" + n);
		}

		s.close();
	}

}

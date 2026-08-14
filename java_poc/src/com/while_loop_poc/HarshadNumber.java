package com.while_loop_poc;

import java.util.Scanner;

//Example:
//
//18
//
//1 + 8 = 9
//
//18 % 9 = 0
//
//Therefore, 18 is a Harshad Number/Niven Number.
public class HarshadNumber {

	static int sumNum(int n) {
		int sum = 0;
		int r = 0;

		while (n > 0) {
			r = n % 10;
			sum += r;
			n = n / 10;
		}
		System.out.println("Sum of each digit : " + sum);
		return sum;
	}

	static boolean isHarshadNum(int sum, int n) {
		boolean flag = false;

		if (n % sum == 0) {
			flag = true;
		}

		return flag;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = s.nextInt();

		int sum = sumNum(n);

		if (isHarshadNum(sum, n)) {
			System.out.println("Giver Number is Harshad Number : " + n);
		} else {
			System.out.println("Giver Number is not Harshad Number : " + n);
		}
		s.close();

	}

}

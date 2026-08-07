package com.for_loop_poc;

import java.util.Scanner;

public class CheckAllDigitOdd {

	static boolean isAllDigitOdd(int n) {
		boolean flag = false;
		int digit = 0;
		int countOdd = 0;
		int count =0;

		for (int i = n; i > 0; i = i / 10) {
			digit = i%10;
			if(digit % 2 !=0) {
				countOdd++;
			}
			count++;
		}

		if(countOdd == count) {
			flag = true;
		}
		
		return flag;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();

		boolean status = isAllDigitOdd(n);
		
		
		if(status) {
			System.out.println("All Digits Given Number is Odd digits !");
		}else {
			System.out.println("All Digits Given Number is Not Odd digits !");
		}

		s.close();

	}

}

package com.for_loop_poc;

import java.util.Scanner;

//1! = 1
//4! = 24
//5! = 120
//
//1 + 24 + 120 = 145
public class StrongNumber {

	static int fact(int n) {
		int fact = 1;
		if (n == 0) {
			return fact;
		}
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	static boolean isStrong(int n) {
		boolean flag = false;
		int digit =0;
		int sum = 0;
		for(int i=n;i>0;i= i/10) {
			digit = i %10;
			sum += fact(digit);
		}
	
		if(sum == n) {
			flag = true;
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();

		if(isStrong(n)) {
			System.out.println("Give Number is Strong Number :"+n);
		}else {
			System.out.println("Give Number is not Strong Number :"+n);
		}
		s.close();

	}

}

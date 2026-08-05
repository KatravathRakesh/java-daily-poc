package com.for_loop_poc;

import java.util.Scanner;

public class DigitCountAndSumOfDigit {

	static int digitCount(int n) {
		int digit = 0;
		int count = 0;
		
		for(int i=n;i>0;i=i/10) {
			digit = i%10;//123->3
			count++;
		}
		return count;
	}
	
	static int sumOfDigit(int n) {
		int digit = 0;
		int sum = 0;
		for(int i =n; i>0;i = i/10) {
			digit = i%10;
			sum += digit;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		
		int result = digitCount(n);
		System.out.println("Number of Digits : "+result);
		
		int sum = sumOfDigit(n);
		System.out.println("Sum of Digits : "+sum);
		s.close();

	}

}

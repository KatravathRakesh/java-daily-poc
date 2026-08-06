package com.for_loop_poc;

import java.util.Scanner;

public class CountZeroDigits {

	static int countZeroDigit(int n) {
		int digit =0;
		int count =0;
		
		for(int i=n;i>0;i= i/10) {
			digit = i%10;
			if(digit == 0) {
				count++;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		
		int count = countZeroDigit(n);
		System.out.println("Count Zero Digit in Given Number : "+count);
		
		s.close();
	}

}

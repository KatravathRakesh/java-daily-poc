package com.for_loop_poc;

import java.util.Scanner;

public class DifferenceBetweenEvenAndOddDigitSums {

	static int diffEvenOfOdd(int n) {
		int digit = 0;
		int Evensum = 0;
		int Oddsum = 0;
		
		for(int i=n;i>0;i = i/10) {
			digit = i %10;
			if(digit % 2 == 0 ) {
				Evensum += digit;
			}else {
				Oddsum +=digit;
			}
		}
		int diff = Math.abs(Evensum - Oddsum);
		
		return diff;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		
		int diff = diffEvenOfOdd(n);
		System.out.println("Difference B/w Even And Odd Digit Sum in given Number : "+diff);
		
		s.close();

	}

}

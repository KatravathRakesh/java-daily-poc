package com.for_loop_poc;

import java.util.Scanner;

public class LastDigit {

	static int lastDigit(int n) {
		int digit = 0;
		int ld = 0;
		
		for(int i=n;i>0;i = i/10) {
			digit = i%10;
			if(i == n) {
				ld = digit;
			}
		}
		
		return ld;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		
		int ld = lastDigit(n);
		System.out.println("Last Digit in Given Number : "+ld);
		
		s.close();
	}

}

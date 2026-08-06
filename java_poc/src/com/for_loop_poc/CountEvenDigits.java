package com.for_loop_poc;

import java.util.Scanner;

public class CountEvenDigits {

	static int countEvenDigit(int n) {
		int digit =0;
		int count =0;
		
		for(int i=n;i>0;i= i/10) {
			digit = i%10;
			if(digit%2 == 0) {
				count++;
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		
		int count = countEvenDigit(n);
		System.out.println("Count Even Digit in Given Number : "+count);
		
		s.close();

	}

}

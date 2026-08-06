package com.for_loop_poc;

import java.util.Scanner;

public class LargestDigitOfGivenNumber {
	
	static int largestDigit(int n) {
		int digit = 0;
		int largest = 0;
		
		for(int i=n;i>0;i = i/10) {
			digit = i%10;
			if(largest < digit) {
				largest = digit;
			}
		}
		
		return largest;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = s.nextInt();
		
		int lar = largestDigit(n);
		System.out.println("Largest Digit in Given Number : "+lar);
		
		s.close();

	}

}

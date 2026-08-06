package com.for_loop_poc;

import java.util.Scanner;

public class SmallestDigitOfGivenNumber {
	
	static int smallestDigit(int n) {
		int digit = 0;
		int smallest = Integer.MAX_VALUE;
		
		for(int i = n;i>0;i = i/10) {
			digit = i%10;
			if(smallest > digit ) {
				smallest = digit;
			}
		}
		
		return smallest;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = s.nextInt();
		
		int smallest = smallestDigit(n);
		
		System.out.println("Smallest Digit in Given Number : "+smallest);
		
		s.close();

	}

}

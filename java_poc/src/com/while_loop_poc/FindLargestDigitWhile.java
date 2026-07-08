package com.while_loop_poc;

import java.util.Scanner;

//Find the largest digit in a number.
public class FindLargestDigitWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		int digit = 0;
		int r =0;
		
		while(n>0) {
			r = n%10;
			if(digit < r) {
				digit = r;
			}
			n = n/10;
		}
		
		System.out.println("Largest digit in a given number : "+digit);

	}

}

package com.while_loop_poc;

import java.util.Scanner;

//Find the smallest digit in a number.
public class FindSmallestDigitWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		int digit = 9;
		int r =0;
		
		while(n>0) {
			r = n%10;
			if(digit > r) {
				digit = r;
			}
			n = n/10;
		}
		
		System.out.println("Largest digit in a given number : "+digit);

	}

}

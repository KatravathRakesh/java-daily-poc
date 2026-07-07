package com.while_loop_poc;

import java.util.Scanner;

//Count the digits in a number.
public class CountDigitsWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		int r =0;
		int count = 0;
		
		while(n>0) {
			r = n % 10;//remainder
			n = n/10; // quotient 
			count++;
			
		}
		System.out.println("Total Count digit number : "+count);
		
	}

}

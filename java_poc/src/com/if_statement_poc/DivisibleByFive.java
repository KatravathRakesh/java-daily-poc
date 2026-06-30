package com.if_statement_poc;

import java.util.*;
//Check if a number is divisible by 5.
public class DivisibleByFive {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter num : ");
		int num = s.nextInt();
		
		if(num%5 == 0) {
			System.out.println("Number is divisible by 5.");
		}

	}

}

package com.if_statement_poc;

import java.util.Scanner;

//Check whether a number is greater than 100
public class NumberGreaterThanHundred {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number : ");
		double num = s.nextDouble();
		
		if(num >100 ) {
			System.out.println("Greater than 100.");
		}

	}

}



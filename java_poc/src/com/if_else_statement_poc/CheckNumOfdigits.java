package com.if_else_statement_poc;

import java.util.Scanner;

public class CheckNumOfdigits {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = s.nextInt();
		
		if(num >999) {
			System.out.println("Give number is more than three digits.");
		}else if(num >100 && num <1000) {
			System.out.println("Give number is three digit number");
		}else if(num >10 && num < 100) {
			System.out.println("Give number is two digit number");
		}else {
			System.out.println("Give number is one digit number");
		}
		

	}

}

package com.nested_if_else_statement_poc;

import java.util.*;
//Check loan eligibility based on age, salary, and CIBIL score.
public class LoanEligibility {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Age : ");
		int age = s.nextInt();
		System.out.print("Enter the salary : ");
		double salary = s.nextDouble();
		System.out.println("Enter the CIBIL score : ");
		int score = s.nextInt();
		
		if(age > 28) {
			if(salary >= 30000) {
				if(score >= 750 ) {
					System.out.println("Congratulations your eligible for Loan , Thank you for visting our bank ,Have a nice day!");
				}else {
					System.out.println("Sorry we cannot approve your Loan due to your CIBIL score ,Better luck next time!");
				}
			}else {
				System.out.println("Sorry we cannot approve your loan due to your monthly income.");
			}
		}else {
			System.out.println("You are not eligible for loan due to your Age.");
		}

	}

}

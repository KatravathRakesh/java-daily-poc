package com.if_statement_poc;

import java.util.Scanner;
//Check whether a person is eligible to vote (age >= 18).
public class VoteEligibility {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the age : ");
		int age = s.nextInt();
		
		if(age >=18) {
			System.out.println("Person is eligible to vote.");
		}
	}

}

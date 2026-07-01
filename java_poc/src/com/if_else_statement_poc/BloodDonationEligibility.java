package com.if_else_statement_poc;

import java.util.*;
//Check whether a person is eligible to donate blood.
public class BloodDonationEligibility {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Age : ");
		int age = s.nextInt();
		
		if(age >= 18) {
			System.out.println("A person is eligible to donate blood.");
		}else {
			System.out.println("A person is not eligible to donate blood.");
		}

	}

}

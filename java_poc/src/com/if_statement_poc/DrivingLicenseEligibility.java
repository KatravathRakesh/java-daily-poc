package com.if_statement_poc;

import java.util.*;

//Check whether age is at least 18 for a driving license.
public class DrivingLicenseEligibility {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the age : ");
		int age = s.nextInt();
		
		if(age >= 18) {
			System.out.println("Eligible for a driving license.");
		}
	}

}


package com.if_statement_poc;

import java.util.*;
//Check whether marks are 90% or above.

public class ScholarshipEligibility {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the marks : ");
		int marks = s.nextInt();
		
		
		if(marks >= 90) {
			System.out.println("Your Eligibility for Scholarship due to "+marks+" % you scored");
		}

	}

}

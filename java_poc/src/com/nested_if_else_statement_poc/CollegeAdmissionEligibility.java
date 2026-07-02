package com.nested_if_else_statement_poc;

import java.util.*;
//Check admission based on marks and age.
public class CollegeAdmissionEligibility {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the marks : ");
		int mark = s.nextInt();
		System.out.print("Enter the Age : ");
		int age = s.nextInt();
		if(age >=18) {
			if(mark >= 65) {
				System.out.println("Your are Eligible college admission");
			}else {
				System.out.println("Mark not Eligible for college admission");
			}
		}else {
			System.out.println("Age not Eligible for college admission");
		}

	}

}

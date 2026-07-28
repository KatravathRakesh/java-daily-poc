package com.oops.inheritance;

import java.util.Scanner;

public class PersonalLoan extends Loan{
	static Scanner s = new Scanner(System.in);
	
	void PersnalLoanDocInfo() {
		System.out.println("Person Loan document have been receive Successfully !");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube banking Loan !");
		PersonalLoan p1 = new PersonalLoan();

		boolean isValidPhone = p1.isValidPhone();
		boolean isValidAadhar = p1.isValidAadhar();
		boolean isValidPAN = p1.isValidPAN();

		if (isValidPhone && isValidAadhar && isValidPAN) {
			String name = p1.getCustomerName();
			System.out.println("Welcome to Vcube Banking Mr." + name);

			double sal = p1.getCustomerSalary();
			int cibil = p1.getCibilScore();
			int age = p1.getCustomerAge();
			double roi = p1.getROI();
			
			if (sal >= 700000.0 && (age >= 22 && age <= 60) && (cibil >= 300 && cibil < 900)) {
				System.out.println("Congratulations , Your Eligible for Personal Loan !");
				System.out.println("Your Rate of Interest is : " + roi);
				p1.PersnalLoanDocInfo();
			} else {
				System.out.println("Sorry! You are not eligible for the loan.");
			}
		} else {
			System.out.println("Invalid Details !");
		}

	}

}

package com.oops.inheritance;

import java.util.Scanner;

public class HomeLoan extends Loan{
	static Scanner s = new Scanner(System.in);

	void HomeLoanDocInfo() {
		System.out.println("Home Loan document have been receive Successfully !");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube banking Loan !");
		HomeLoan h1 = new HomeLoan();

		boolean isValidPhone = h1.isValidPhone();
		boolean isValidAadhar = h1.isValidAadhar();
		boolean isValidPAN = h1.isValidPAN();

		if (isValidPhone && isValidAadhar && isValidPAN) {
			String name = h1.getCustomerName();
			System.out.println("Welcome to Vcube Banking Mr." + name);

			double sal = h1.getCustomerSalary();
			int cibil = h1.getCibilScore();
			int age = h1.getCustomerAge();
			double roi = h1.getROI();

			if (sal >= 500000.0 && (age >= 22 && age <= 45) && (cibil >= 300 && cibil < 900)) {
				System.out.println("Congratulations , Your Eligible for Personal Loan !");
				System.out.println("Your Rate of Interest is : " + roi);
				h1.HomeLoanDocInfo();
			} else {
				System.out.println("Sorry! You are not eligible for the loan.");
			}
		} else {
			System.out.println("Invalid Details !");
		}

	}

}

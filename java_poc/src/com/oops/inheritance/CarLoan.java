package com.oops.inheritance;

import java.util.Scanner;

public class CarLoan extends Loan {

	static Scanner s = new Scanner(System.in);

	void CarLoanDocInfo() {
		System.out.println("Car Loan document have been receive Successfully !");
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Vcube banking Loan !");
		CarLoan c1 = new CarLoan();

		boolean isValidPhone = c1.isValidPhone();
		boolean isValidAadhar = c1.isValidAadhar();
		boolean isValidPAN = c1.isValidPAN();

		if (isValidPhone && isValidAadhar && isValidPAN) {
			String name = c1.getCustomerName();
			System.out.println("Welcome to Vcube Banking Mr." + name);

			double sal = c1.getCustomerSalary();
			int cibil = c1.getCibilScore();
			int age = c1.getCustomerAge();
			double roi = c1.getROI();

			if (sal >= 400000.0 && (age >= 22 && age <= 45) && (cibil >= 300 && cibil < 900)) {
				System.out.println("Congratulations , Your Eligible for Personal Loan !");
				System.out.println("Your Rate of Interest is : " + roi);
				c1.CarLoanDocInfo();
			} else {
				System.out.println("Sorry! You are not eligible for the loan.");
			}
		} else {
			System.out.println("Invalid Details !");
		}

	}

}

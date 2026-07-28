package com.oops.inheritance;

import java.util.Scanner;

public class Loan {
	static Scanner s = new Scanner(System.in);

	String getCustomerName() {
		System.out.print("Enter your name : ");
		s.nextLine();
		String name = s.nextLine();
		return name;
	}

	int getCustomerAge() {
		System.out.print("Enter your Age : ");
		int age = s.nextInt();
		return age;
	}

	double getCustomerSalary() {
		System.out.print("Enter your Salary : ");
		double sal = s.nextDouble();
		return sal;
	}

	int getCibilScore() {
		System.out.print("Enter Cibil Score : ");
		int score = s.nextInt();
		return score;
	}

	boolean isValidPhone() {
		System.out.print("Enter the Phone : ");
		String phone = s.next();
		boolean isValid = phone.matches("^[6-9][0-9]{9}");
		return isValid;
	}

	boolean isValidAadhar() {
		System.out.print("Enter the Aadhar : ");
		String aadhar = s.next();
		boolean isValid = aadhar.matches("^[2-9][0-9]{11}");
		return isValid;
	}

	// PAN - ABCDE8745H
	boolean isValidPAN() {
		System.out.print("Enter the PAN : ");
		String pan = s.next();
		boolean isValid = pan.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}");
		return isValid;
	}

	double getROI() {
		int cibil = getCibilScore();
		double roi = 12.0;
		if (cibil >= 300 && cibil < 550) {
			System.out.println(" Poor credit-- loans are rarely approved");
			return roi + 1;
		} else if (cibil >= 550 && cibil < 650) {
			System.out.println("Fair credit-- some lenders may hesitate.");
			return roi;
		} else if (cibil >= 650 && cibil < 750) {
			System.out.println("Very good credit--high probability of loan approval.");
			return roi - 2;
		} else if (cibil >= 750 && cibil < 900) {
			System.out.println("Excellent creditworthiness -- best chances for loans and pre-approved offers.");
			return roi - 4;
		} else {
			System.out.println("Invaild Cibil Score ! ");
			return roi;
		}

	}
}

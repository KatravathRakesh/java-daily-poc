package com.nested_if_else_statement_poc;

import java.util.Scanner;

public class MatrimonyPortal {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("========== MATRIMONY PORTAL ==========\n");

		System.out.print("Enter your total assets (₹): ");
		double assets = s.nextDouble();

		System.out.print("Enter your age: ");
		int age = s.nextInt();
		s.nextLine();

		// Basic Eligibility
		if (assets >= 50000000 && age >= 27 && age <= 29) {

			System.out.print("\nEnter your name: ");
			String name = s.nextLine();

			System.out.println("Welcome, Mr. " + name + "!");

			System.out.print("Enter your annual salary (₹): ");
			double salary = s.nextDouble();

			if (salary >= 500000) {

				System.out.print("Do you have any siblings? (true/false): ");
				boolean hasSiblings = s.nextBoolean();

				if (!hasSiblings) {

					System.out.print("Do you drink or smoke? (true/false): ");
					boolean badHabits = s.nextBoolean();

					if (!badHabits) {

						System.out.print("Enter your height (feet): ");
						double height = s.nextDouble();

						System.out.print("Enter your weight (kg): ");
						double weight = s.nextDouble();

						if (height >= 5.6 && height <= 6.0 &&
								weight >= 60 && weight <= 80) {

							System.out.println("\n=================================");
							System.out.println("Congratulations, Mr. " + name + "!");
							System.out.println("Your profile has been shortlisted.");
							System.out.println("=================================");

						} else {
							System.out.println("\nRejected: Height/Weight criteria not satisfied.");
						}

					} else {
						System.out.println("\nRejected: We prefer non-smokers and non-drinkers.");
					}

				} else {
					System.out.println("\nRejected: Preference is given to candidates without siblings.");
				}

			} else {
				System.out.println("\nRejected: Minimum salary should be ₹5,00,000 per year.");
			}

		} else {
			System.out.println("\nRejected: Age or asset criteria not satisfied.");
		}

		s.close();
	}
}
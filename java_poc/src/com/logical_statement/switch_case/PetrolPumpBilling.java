package com.logical_statement.switch_case;

import java.util.Scanner;

public class PetrolPumpBilling {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String yn = "";
		System.out.println("============ Petrol Pump Billing ============");
		System.out.println();
		do {
			System.out.print("Enter your choice : ");
			int choice = s.nextInt();
			System.out.print("Enter customer name : ");
			s.nextLine();
			String name = s.nextLine();


			System.out.println();
			double rate = 0.0;
			double totalbill = 0.0;
			System.out.println("-------------------------------------------");
			switch (choice) {
			case 1 -> {
				System.out.print("Enter Petrol quantity (litres) : ");
				int quantity = s.nextInt();
				rate = 105;
				if (quantity > 0) {
					System.out.println("Customer Name : " + name);
					System.out.println("Fuel Type : Petrol");
					System.out.println("Rate : " + rate + "/L");
					System.out.println("Quantity : " + quantity + " L");
					totalbill = rate * quantity;
					System.out.println("Total Bill : ₹" + totalbill);
				} else {
					System.out.println("Invalid Quantity !");
				}
			}

			case 2 -> {
				System.out.print("Enter Diesel quantity (litres) : ");
				int quantity = s.nextInt();
				if (quantity > 0) {
					rate = 95;
					System.out.println("Customer Name : " + name);
					System.out.println("Fuel Type : Diesel");
					System.out.println("Rate : " + rate + "/L");
					System.out.println("Quantity : " + quantity + " L");
					totalbill = rate * quantity;
					System.out.println("Total Bill : ₹" + totalbill);
				} else {
					System.out.println("Invalid Quantity !");
				}
			}

			case 3 -> {
				System.out.print("Enter CNG quantity (kg) : ");
				int quantity = s.nextInt();
				rate = 75;
				if (quantity > 0) {
					System.out.println("Customer Name : " + name);
					System.out.println("Fuel Type : CNG");
					System.out.println("Rate : " + rate + "/kg");
					System.out.println("Quantity : " + quantity + " kg");
					totalbill = rate * quantity;
					System.out.println("Total Bill : ₹" + totalbill);
				} else {
					System.out.println("Invalid Quantity !");
				}
			}

			case 4 -> {
				System.out.print("Enter EV Charging quantity (units(kWh)) : ");
				int quantity = s.nextInt();
				rate = 15;
				if (quantity > 0) {
					System.out.println("Customer Name : " + name);
					System.out.println("Fuel Type : EV Charging");
					System.out.println("Rate : " + rate + "/units");
					System.out.println("Quantity : " + quantity + " units");
					totalbill = rate * quantity;
					System.out.println("Total Bill : ₹" + totalbill);
				} else {
					System.out.println("Invalid Quantity !");
				}
			}

			case 5 -> System.out.println("Exit !");

			default -> System.out.println();
			}

			System.out.println("-------------------------------------------");
			System.out.println("Do you want to continue? (Y/N)");
			yn = s.next();
		} while (yn.equalsIgnoreCase("Y"));

		s.close();
	}

}

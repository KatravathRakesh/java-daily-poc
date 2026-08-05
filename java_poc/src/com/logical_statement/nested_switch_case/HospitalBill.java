package com.logical_statement.nested_switch_case;

import java.util.Scanner;

//========= HOSPITAL =========
//
//1. General Medicine
//2. Cardiology
//3. Orthopedics
//4. Pediatrics

//Appointment Booked Successfully
//Department : Cardiology
//Doctor     : Dr. Arjun
//Consultation Fee : ₹800
public class HospitalBill {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String yn = "";
		double totalfee = 0.0;
		System.out.println("=============== HOSPITAL ===============");
		System.out.println();
		do {
		String dept1 = "General Medicine";
		String dept2 = "Cardiology";
		String dept3 = "Orthopedics";
		String dept4 = "Pediatrics";
		System.out.println("1 ." + dept1 + "\n" + "2 ." + dept2 + "\n" + "3 ." + dept3 + "\n" + "4 ." + dept4);
		System.out.println();
		System.out.print("Choice the Department : ");
		int choice = s.nextInt();
		System.out.println();
		switch (choice) {
		case 1 -> {
			System.out.println(dept1);
			System.out.println("----------------------------");
			String name1 = "Dr. Ravi";
			String name2 = "Dr. Priya";
			System.out.println("1 ." + name1 + "\n" + "2 ." + name2);
			
			System.out.println();
			System.out.print("Choice Doctor : ");
			int choice1 = s.nextInt();

			System.out.println();

			switch (choice1) {
			case 1 -> {
				System.out.println("Appointment Booked Successfully !");
				System.out.println("Department : " + dept1);
				System.out.println("Doctor : " + name1);
				double fee = 500.0;
				System.out.println("Consultation Fee  : ₹" + fee);
				totalfee += fee;
			}
			case 2 -> {
				System.out.println("Appointment Booked Successfully !");
				System.out.println("Department : " + dept1);
				System.out.println("Doctor : " + name2);
				double fee = 600.0;
				System.out.println("Consultation Fee  : ₹" + fee);
				totalfee += fee;
			}
			default -> System.out.println("Invalid Doctor Choice!");
			}
		}
		case 2 -> {
			System.out.println(dept2);
			System.out.println("---------------------------");
			String name1 = "Dr. Arjun";
			String name2 = "Dr. Sneha";
			System.out.println("1 ." + name1 + "\n" + "2 ." + name2);

			System.out.println();
			System.out.print("Choice Doctor : ");
			int choice1 = s.nextInt();

			System.out.println();

			switch (choice1) {
			case 1 -> {
				System.out.println("Appointment Booked Successfully !");
				System.out.println("Department : " + dept2);
				System.out.println("Doctor : " + name1);
				double fee = 1000.0;
				System.out.println("Consultation Fee  : ₹" + fee);
				totalfee += fee;
			}
			case 2 -> {
				System.out.println("Appointment Booked Successfully !");
				System.out.println("Department : " + dept2);
				System.out.println("Doctor : " + name2);
				double fee = 1200.0;
				System.out.println("Consultation Fee  : ₹" + fee);
				totalfee += fee;
			}
			default -> System.out.println("Invalid Doctor Choice!");
			}
		}
		case 3 -> {
			System.out.println(dept3);
			System.out.println("---------------------------");
			String name1 = "Dr. Kiran";
			String name2 = "Dr. Meena";
			System.out.println("1 ." + name1 + "\n" + "2 ." + name2);

			System.out.println();
			System.out.print("Choice Doctor : ");
			int choice1 = s.nextInt();

			System.out.println();

			switch (choice1) {
			case 1 -> {
				System.out.println("Appointment Booked Successfully !");
				System.out.println("Department : " + dept3);
				System.out.println("Doctor : " + name1);
				double fee = 800.0;
				System.out.println("Consultation Fee  : ₹" + fee);
				totalfee += fee;
			}
			case 2 -> {
				System.out.println("Appointment Booked Successfully !");
				System.out.println("Department : " + dept3);
				System.out.println("Doctor : " + name2);
				double fee = 900.0;
				System.out.println("Consultation Fee  : ₹" + fee);
				totalfee += fee;
			}
			default -> System.out.println("Invalid Doctor Choice!");
			}
		}
		case 4 -> {
			System.out.println(dept4);
			System.out.println("----------------------------");
			String name1 = "Dr. Rahul";
			String name2 = "Dr. Anjali";
			System.out.println("1 ." + name1 + "\n" + "2 ." + name2);

			System.out.println();
			System.out.print("Choice Doctor : ");
			int choice1 = s.nextInt();

			System.out.println();

			switch (choice1) {
			case 1 -> {
				System.out.println("Appointment Booked Successfully !");
				System.out.println("Department : " + dept4);
				System.out.println("Doctor : " + name1);
				double fee = 700.0;
				System.out.println("Consultation Fee  : ₹" + fee);
				totalfee += fee;
			}
			case 2 -> {
				System.out.println("Appointment Booked Successfully !");
				System.out.println("Department : " + dept4);
				System.out.println("Doctor : " + name2);
				double fee = 750.0;
				System.out.println("Consultation Fee  : ₹" + fee);
				totalfee += fee;
			}
			default -> System.out.println("Invalid Doctor Choice!");
			}
		}
		default -> System.out.println("Invalid Department Choice!");
		}
		System.out.println("Do you want continue any other appointment then click (yes -> y / No - > n) :");
		yn = s.next();
		}while(yn.equalsIgnoreCase("Y"));
		
		System.out.println("-------------------------------------");
		System.out.println("Total Hospital Bill : "+totalfee);
		s.close();

	}

}

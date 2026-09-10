package com.oops.abstraction;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("*****************" + Student.grade + "********************");

		String yn = "";

		do {
			System.out.println("1.EngineeringStudent ");
			System.out.println("2.MedicalStudent ");
			System.out.println("3.ManagementStudent ");
			System.out.println("Choice which Department Student Grade do You want !");
			int choice = s.nextInt();
			switch (choice) {
			case 1 -> {
				System.out.print("Enter the Marks : ");
				int mark = s.nextInt();
				EngineeringStudent e = new EngineeringStudent(mark);
				e.calculateGrade();
			}

			case 2 -> {
				System.out.print("Enter the Marks : ");
				int mark = s.nextInt();
				Student med = new MedicalStudent(mark);
				med.calculateGrade();
			}

			case 3 -> {
				System.out.print("Enter the Marks : ");
				int mark = s.nextInt();
				Student mgt = new ManagementStudent(mark);
				mgt.calculateGrade();
			}

			default -> {
				System.out.println("You are selected invalid choice !!");
			}
			}

			System.out.println("Do you want continues pass if yes->y/No -> n");
			yn = s.next();
		} while (yn.equalsIgnoreCase("Y"));

		s.close();
	}

}

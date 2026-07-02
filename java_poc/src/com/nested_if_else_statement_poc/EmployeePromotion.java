package com.nested_if_else_statement_poc;

import java.util.Scanner;
//Check promotion eligibility based on experience and performance.
public class EmployeePromotion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("How is the employee performance ? : ");
		String performance = s.nextLine();
		System.out.print("Year of experience ? : ");
		int year = s.nextInt();
		
		if(year >= 5) {
			if(performance.equalsIgnoreCase("good")) {
				System.out.println("Your eligible for promotion !");
			}else {
				System.out.println("Your not eligible for promotion due to bad preformance!");
			}
		}else {
			System.out.println("Your not eligible for promotion due to year of experience!");
		}
		
	}

}

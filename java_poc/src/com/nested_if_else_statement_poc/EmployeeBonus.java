package com.nested_if_else_statement_poc;

import java.util.*;
//Calculate bonus based on salary and experience.
public class EmployeeBonus {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the salary : ");
		long salary = s.nextLong();
		System.out.print("Enter the Experience years : ");
		int year = s.nextInt();
		double bonus;
		
		if(salary >= 50000) {
			if(year >= 5) {
				bonus = salary*0.20;
				System.out.println("Bonus : "+bonus);
			}else {
				System.out.println("Your not eligible for bonus based on your year work Experience !");
			}
		}else {
			System.out.println("Your not eligible for bonus based on your salary !");
		}

	}

}

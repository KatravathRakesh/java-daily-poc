package com.if_else_statement_poc;

import java.util.*;
//Check whether an employee is eligible for a bonus.
public class SalaryBonusCheck {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the slary : ");
		double salary = s.nextDouble();
		if(salary > 500000) {
			System.out.println("Employee is eligible for a bonus.");
		}else {
			System.out.println("Employee is not eligible for a bonus.");
		}

	}

}

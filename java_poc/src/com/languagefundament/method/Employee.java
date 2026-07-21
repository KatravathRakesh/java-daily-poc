package com.languagefundament.method;

import java.util.Scanner;

public class Employee {
	
	
	public static void salarySlip(String eName, double basic_salary) {
		double HRA = basic_salary*0.20;
		double DA = basic_salary*0.10;
		double Gross_salary = basic_salary + HRA + DA;
		
		System.out.println("Employee Name : "+eName);
		System.out.println("Employee HRA(20%) : "+HRA);
		System.out.println("Employee DA(10%) : "+DA);
		System.out.println("Employee Gross Salary : "+Gross_salary);
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Employee Name : ");
		String eName = s.nextLine();
		System.out.print("Enter the Employee Basic Salary : ");
		double basic_salary = s.nextDouble();
		
		salarySlip(eName,basic_salary);

	}

}

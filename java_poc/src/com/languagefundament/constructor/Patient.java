package com.languagefundament.constructor;

import java.util.Scanner;

public class Patient {
	String name;
	int age;
	double chargePerDay;
	int daysAdmitted;
	

	public Patient(String name,int age,double chargePerDay,int daysAdmitted) {
		this.name = name;
		this.age = age;
		this.chargePerDay = chargePerDay;
		this.daysAdmitted = daysAdmitted;
	}


	void show() {
		double bill = chargePerDay*daysAdmitted;
		System.out.println("Patient Name : "+name);
		System.out.println("Patient Age : "+age);
		System.out.println("Patient Room Charge Per Day : "+chargePerDay);
		System.out.println("Patient Days Admitted : "+daysAdmitted);
		System.out.println("Patient Total Hospital Bill : "+bill);
		System.out.println("*********************************");
	}

	public static void main(String[] args) {
		String ch;
		do {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter Patient Name :");
			String name = s.nextLine();
			System.out.print("Enter Patient Age :");
			int age = s.nextInt();
			System.out.print("Enter Patient Room Charge Per Day :");
			double chargePerDay = s.nextDouble();
			System.out.print("Enter Patient Number of Days Admitted :");
			int daysAdmitted = s.nextInt();
			Patient p1 = new Patient(name,age,chargePerDay,daysAdmitted);
			p1.show();
			
			System.out.print("Do you want containu Yes/No : ");
			ch = s.next();
		}while(ch.equalsIgnoreCase("yes"));
	}

}

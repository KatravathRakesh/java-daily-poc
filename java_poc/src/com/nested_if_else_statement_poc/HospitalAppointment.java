package com.nested_if_else_statement_poc;

import java.util.Scanner;

//Confirm appointment based on doctor availability and payment.
public class HospitalAppointment {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Is Doctor Available : ");
		String doc = s.nextLine();
		System.out.print("Is Payment done : ");
		String pymt = s.nextLine();
		
		if(doc.equals("yes")) {
			if(pymt.equals("yes")) {
				System.out.println("Appointment is Confirmed!");
			}else {
				System.out.println("Payment not done.!");
			}
		}else {
			System.out.println("Doctor not Available.!");
		}
	}

}

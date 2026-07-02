package com.nested_if_else_statement_poc;

import java.util.*;
//Confirm ticket based on seat availability and payment status.
public class RailwayTicketBooking {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Is seat availble(yes/no) : ");
		String seat = s.nextLine();
		System.out.print("Is payment Done (yes/no) : ");
		String pymt = s.nextLine();
		System.out.print("Enter the Age : ");
		int age = s.nextInt();
		
		if(age > 15) {
			if(seat.equalsIgnoreCase("yes")) {
				
			  if(pymt.equalsIgnoreCase("yes")) {
				System.out.println("Ticket is Confirmed successfully!");
				
				}else {
					System.out.println("Payment not completed. Ticket cannot be confirmed.");
				}
			}else {
				System.out.println("Seat is not available. Ticket is in waiting list!");
			}
		}else {
			System.out.println("We cannot allocate ticket because person is Minor!");
		}
		

	}

}

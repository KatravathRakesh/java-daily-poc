package com.nested_if_else_statement_poc;

import java.util.*;
//Confirm booking based on seat availability and payment.
public class CinemaTicketBooking {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Check seat Available : ");
		String seat = s.nextLine();
		System.out.print("Verify payment done or Not : ");
		String pymt = s.nextLine();
		
		if(seat.equals("yes")) {
			if(pymt.equals("yes")) {
				System.out.println("Booking Confirmed!");
			}else {
				System.out.println("Booking Not Confirmed!, Payment not done");
			}
		}else {
			System.out.println("Seat not Available!");
		}

	}

}

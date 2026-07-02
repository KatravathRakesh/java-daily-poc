package com.nested_if_else_statement_poc;

import java.util.*;
//Allocate room based on room availability and payment.
public class HotelRoomBooking {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Age : ");
		int age = s.nextInt();
		s.nextLine();
		System.out.print("Is room Availble (yes/no): ");
		String availability = s.nextLine();
		System.out.print("Is payment Done (yes/No): ");
		String pymt = s.nextLine();
		
		if(age >18) {
			if(availability.equalsIgnoreCase("yes")) {
				if(pymt.equalsIgnoreCase("yes")) {
					System.out.println("Payment is done room is allocated!!");
				}else {
					System.out.println("Payment is not done so, room not allocated!!");
				}
			}else {
				System.out.println("Room is not available ");
			}
		}else {
			System.out.println("Room is not allocated because customer is a minor ");
		}
	}

}

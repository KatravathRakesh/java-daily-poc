package com.logical_statement.switch_case;

import java.util.Scanner;

public class TrainTicketReservation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String yn = "";
		System.out.println("=========== Train Ticket Reservation ===========");
		System.out.println();
		
		do {
			System.out.print("Enter your choice : ");
			int choice = s.nextInt();
			System.out.print("Enter Passenger name : ");
			s.nextLine();
			String name = s.nextLine();
			System.out.print("Enter age : ");
			int age = s.nextInt();
			System.out.print("Enter number of tickets : ");
			int NumOfTickets = s.nextInt();
			System.out.println("-------------------------------------------");
			double amount = 0.0;
			double totalamount = 0.0;
	
			switch(choice) {
			case 1 -> {
				amount = 350.0;
				System.out.println("Passenger : "+name);
				System.out.println("Class : Sleeper");
				if(age < 5) {
					System.out.println("Children below 5 travel FREE.");
					System.out.println("Total Amount : "+totalamount);
				}else {
					totalamount = amount*NumOfTickets;
					System.out.println("Total Amount : "+totalamount);
				}
			}
			case 2 -> {
				amount = 800.0;
				System.out.println("Passenger : "+name);
				System.out.println("Class : 3AC");
				if(age < 5) {
					System.out.println("Children below 5 travel FREE.");
					System.out.println("Total Amount : "+totalamount);
				}else {
					totalamount = amount*NumOfTickets;
					System.out.println("Total Amount : "+totalamount);
				}
			}
			case 3 -> {
				amount = 1200.0;
				System.out.println("Passenger : "+name);
				System.out.println("Class : 2AC");
				if(age < 5) {
					System.out.println("Children below 5 travel FREE.");
					System.out.println("Total Amount : "+totalamount);
				}else {
					totalamount = amount*NumOfTickets;
					System.out.println("Total Amount : "+totalamount);
				}
			}
			case 4 -> {
				amount = 2000.0;
				System.out.println("Passenger : "+name);
				System.out.println("Class : 1AC");
				if(age < 5) {
					System.out.println("Children below 5 travel FREE.");
					System.out.println("Total Amount : "+totalamount);
				}else {
					totalamount = amount*NumOfTickets;
					System.out.println("Total Amount : "+totalamount);
				}
			}
			case 5 -> System.out.println("Exits !!");
			
			default -> System.out.println("Invalid Choice");
			}
			System.out.println("-------------------------------------------");
			System.out.println();
			
			System.out.println("Are you want to continue then click Yes-> Y / No -> N ");
			yn = s.next();
			
		}while(yn.equalsIgnoreCase("Y"));
		
		s.close();

	}

}

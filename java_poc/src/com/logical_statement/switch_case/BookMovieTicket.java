package com.logical_statement.switch_case;

import java.util.Scanner;


public class BookMovieTicket {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String yn = "";
		do {
			System.out.print("Enter your choice : ");
			int choice = s.nextInt();
			System.out.print("Enter your age : ");
			int age = s.nextInt();
			double price = 0.0;
			double discount = 0.10;
			
			switch(choice) {
			case 1 ->{
				price = 200.0;
				if(age >= 60) {
					price = price - price*discount;
					System.out.println("Silver Ticket Price : "+price);
				}else {
				System.out.println("Silver Ticket Price : "+price);
				}
			}
			case 2 ->{
				price = 300.0;
				if(age >= 60) {
					price = price - price*discount;
					System.out.println("Gold Ticket Price : "+price);
				}else {
				System.out.println("Gold Ticket Price : "+price);
				}
			}
			case 3 ->{
				price = 500.0;
				if(age >= 60) {
					price = price - price*discount;
					System.out.println("Platinum Ticket Price : "+price);
				}else {
				System.out.println("Platinum Ticket Price : "+price);
				}
			}
			case 4 -> System.out.println("Thank you! Visit Again.");
			
			default -> System.out.println("Invalid Type enter");
			}
			
			System.out.println("Do you want to continue ! click if yes ->Y and No -> N ");
			yn = s.next();
		}while(yn.equalsIgnoreCase("Y"));
		
		System.out.println("Exit !!");
		
		s.close();

	}

}

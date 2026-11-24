package com.multithearding;


class BookMyShow{
	int total_Ticket = 10;
	
	synchronized void bookMyTicket(String name, int ticket) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(total_Ticket >= ticket) {
			System.out.println(ticket +" - Ticket have Booked  Successfully by : "+name);
			total_Ticket -= ticket;
			System.out.println("The Remaining Ticket Availble  : "+total_Ticket);
		}else {
			System.err.println("The Ticket are Sold Out !!");
			System.err.println("The Remaining Ticket Availble  : "+total_Ticket);
		}
	}
}

class Customer extends Thread{
	String customerName;
	BookMyShow bms;
	int ticket;
	
	public Customer(String name,BookMyShow bms,int ticket) {
		this.customerName = name;
		this.bms = bms;
		this.ticket = ticket;
	}
	
	@Override
	public void run() {
		bms.bookMyTicket(customerName, ticket);
		
		
		
	}
	
	
}
public class TestBookMyShow {

	static BookMyShow bms = new BookMyShow();
	public static void main(String[] args) {

		System.out.println("Welcome to Book My Show !! Have Some Fun :)");
		
		Customer c1 = new Customer("Yugandhar", bms, 2);
		c1.start();
		
		Customer c2 = new Customer("Rahul", bms, 5);
		c2.start();
		
		Customer c3 = new Customer("Praveen Kumar", bms, 2);
		c3.start();
		
		Customer c4 = new Customer("Suresh", bms, 4);
		c4.start();
	}

}

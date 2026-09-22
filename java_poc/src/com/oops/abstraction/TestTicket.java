package com.oops.abstraction;

class RegularTicket extends Ticket {

	public RegularTicket(int ticketID, String movieName, String seatNumber, double basePrice, String ticketType) {
		super(ticketID, movieName, seatNumber, basePrice, ticketType);
	}

	@Override
	double calculatePrice() {
		return basePrice;
	}

	@Override
	void display() {
		System.out.println("Ticket ID : "+ticketID );
		System.out.println("Movie Name : "+movieName );
		System.out.println("Seat Number : "+seatNumber );
		System.out.println("Ticket Type : "+ticketType );
		System.out.println("-----------------------------------");
		
	}
	
	

}

class PremiumTicket extends Ticket {

	public PremiumTicket(int ticketID, String movieName, String seatNumber, double basePrice, String ticketType) {
		super(ticketID, movieName, seatNumber, basePrice, ticketType);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculatePrice() {
		return basePrice + 100;
	}
	
	@Override
	void display() {
		System.out.println("Ticket ID : "+ticketID );
		System.out.println("Movie Name : "+movieName );
		System.out.println("Seat Number : "+seatNumber );
		System.out.println("Ticket Type : "+ticketType );
		System.out.println("-----------------------------------");
		
	}
	

}

class VIPTicket extends Ticket {

	public VIPTicket(int ticketID, String movieName, String seatNumber, double basePrice, String ticketType) {
		super(ticketID, movieName, seatNumber, basePrice, ticketType);
	}

	@Override
	double calculatePrice() {
		return basePrice + 200;
	}
	
	@Override
	void display() {
		System.out.println("Ticket ID : "+ticketID );
		System.out.println("Movie Name : "+movieName );
		System.out.println("Seat Number : "+seatNumber );
		System.out.println("Ticket Type : "+ticketType );
		System.out.println("-----------------------------------");
		
	}
	

}

public class TestTicket {

	public static void main(String[] args) {
		Ticket t1 = new RegularTicket(101,"RRR","E12",150,"Regular");
		Ticket t2 = new PremiumTicket(106,"RRR","J12",150,"Premium");
		Ticket t3 = new VIPTicket(108,"RRR","Q4",150,"VIP");
		
	
		System.out.println("Base Price : "+t1.calculatePrice());
		t1.display();
		System.out.println("Base Price : "+t2.calculatePrice());
		t2.display();
		System.out.println("Base Price : "+t3.calculatePrice());
		t3.display();
	}

}

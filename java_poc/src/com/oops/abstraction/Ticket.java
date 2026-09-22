package com.oops.abstraction;

public abstract class Ticket {
	int ticketID ;
	String movieName;
	String seatNumber;
	double basePrice;
	String ticketType;
	

	public Ticket(int ticketID, String movieName, String seatNumber, double basePrice, String ticketType) {
		this.ticketID = ticketID;
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		this.basePrice = basePrice;
		this.ticketType = ticketType;
	}



	void display() {
	}


	abstract double calculatePrice();
	
}

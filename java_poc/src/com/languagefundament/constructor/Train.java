package com.languagefundament.constructor;

public class Train {
	int flightNo ; 
	String source;
	String destination;
	
	public Train() {
		this(1012);
	}

	
	public Train(int flightNo) {
		this(flightNo,"Airplan");
	}


	public Train(int flightNo, String source) {
		this(flightNo,source,"Mumbai - Delhi");
	}


	public Train(int flightNo, String source, String destination) {
		this.flightNo = flightNo;
		this.source = source;
		this.destination = destination;
	}


	void show() {
		System.out.println("Flight NO :"+flightNo);
		System.out.println("Source : "+source);
		System.out.println("Destination : "+destination);
		System.out.println("-------------------------------");
	}
	public static void main(String[] args) {
		Train t1 = new Train();
		t1.show();
		
		Train t2 = new Train(45090);
		t2.show();
		
		Train t3 = new Train(56009,"joa");
		t3.show();
		
		Train t4 = new Train(432009,"Dehli","GOA - HYD");
		t4.show();

	}

}

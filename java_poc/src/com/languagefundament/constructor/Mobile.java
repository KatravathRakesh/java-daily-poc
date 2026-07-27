package com.languagefundament.constructor;


//Copy Constructor 
public class Mobile {
	String brand;
	String model;
	double price;

	Mobile(){
		System.out.println("No-argument Constructor !");
		
	}
	Mobile(String brand){
		this.brand = brand;
	}
	Mobile(Mobile m, String model){
		this.brand = m.brand;
		this.model = model;
		
	}
	
	Mobile(Mobile m, double price){
		this.brand = m.brand;
		this.model = m.model;
		this.price = price;
	}
	void show() {
		System.out.println();
		System.out.println("Mobile Brand : " + brand);
		System.out.println("Mobile type : " + model);
		System.out.println("Mobile price : " + price);
		System.out.println("------------------------------");
	}

	public static void main(String[] args) {
		System.out.println("main Metghod Started !");
		
		Mobile m = new Mobile("ViVO");
		m.show();
		
		Mobile m1 = new Mobile(m,"ViVO V72 5G");
		m1.show();
		
		Mobile m2 = new Mobile(m1,22000.0);
		m2.show();
		
		
	}

}

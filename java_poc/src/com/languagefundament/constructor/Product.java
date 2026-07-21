package com.languagefundament.constructor;

public class Product {
	int id;
	String name;
	
	Product() {
		System.out.println("Constructor with no argument : ");
		id = 12;
		name = "Rakesh";
	}
	
	Product(int i,String n){
		System.out.println("Constructor with  Argument : ");
		this.id = i;
		this.name = n;
	}

	 void show() {
		System.out.println("Product id : "+id);
		System.out.println("Product Name : "+name);
	}
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.show();
		Product p2 = new Product(22,"Suresh");
		p2.show();

	}

}

package com.oops.abstraction;

class Product{

	int pid;
	String pName;
	double price;
	
	public Product(int pid, String pName, double price) {
		this.pid = pid;
		this.pName = pName;
		this.price = price;
	}

	void displayProductDetails() {
		System.out.println("Product ID : "+pid);
		System.out.println("Product Name : "+pName);
		System.out.println("Product Price : "+price);
	}
	
	double calculateDiscount() {
		return 0;
	}
}

class Electronics extends Product{
	String brand;
	double discount;
	
	
	
	public Electronics(int pid, String pName, double price, String brand, double discount) {
		super(pid, pName, price);
		this.brand = brand;
		this.discount = discount;
	}



	@Override
	double calculateDiscount() {
		return price*discount;
	}
}

class Clothing extends Product{
	String size;
	double discount;
	
	public Clothing(int pid, String pName, double price, String size, double discount) {
		super(pid, pName, price);
		this.size = size;
		this.discount = discount;
	}



	@Override
	double calculateDiscount() {
		return price*discount;
	}
}

class Furniture  extends Product {
	String material;
	double discount;
	
	
	
	public Furniture(int pid, String pName, double price, String material, double discount) {
		super(pid, pName, price);
		this.material = material;
		this.discount = discount;
	}



	@Override
	double calculateDiscount() {
		return price*discount;
	}
	
	
}
public class TestProduct {

	public static void main(String[] args) {
		Electronics e = new Electronics(101,"Laptop",65000,"Dell",0.15);
		e.displayProductDetails();
		System.out.println("Discount : "+e.calculateDiscount());
		System.out.println("-----------------------------------");
		Clothing c = new Clothing(102,"T-shirt", 500,"XXL",0.12);
		c.displayProductDetails();
		System.out.println("Discount : "+c.calculateDiscount());
		System.out.println("-----------------------------------");
		Furniture f = new Furniture(102,"chair", 4550,"Wood",0.18);
		f.displayProductDetails();
		System.out.println("Discount : "+f.calculateDiscount());
		System.out.println("-----------------------------------");
	}

}

package com.languagefundament.constructor;

public class ProductBill {
	String name;
	double price;
	int quantity;
	
	public ProductBill() {
		this("Phone");
	}
	
	public ProductBill(String name) {
		this(name,17000);
	}
	
	public ProductBill(String name, double price) {
		this(name,price,2);
	}
	
	public ProductBill(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	void show() {
		double TotalBill = price*quantity;
		System.out.println("Product Name : "+name);
		System.out.println("Product Price : "+price);
		System.out.println("Product Quantity : "+quantity);
		System.out.println("Total Product Bill : "+TotalBill);
		System.out.println("--------------------------------------");
	}
	public static void main(String[] args) {
		ProductBill p1 = new ProductBill();
		p1.show();
		
		ProductBill p2 = new ProductBill("TV");
		p2.show();
		
		ProductBill p3 = new ProductBill("Watch",3000);
		p3.show();
		
		ProductBill p4 = new ProductBill("Laptop", 70000, 3);
		p4.show();

	}

}

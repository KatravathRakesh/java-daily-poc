package com.oops.inheritance;

class OrderDetails{
	int orderID;
	String CustomerName;
	double price;
	
	OrderDetails(int orderID,String CustomerName,double price){
		this.orderID = orderID;
		this.CustomerName = CustomerName;
		this.price = price;
	}

	
	void display() {
		System.out.println("Order ID : "+orderID);
		System.out.println("Customer Name : "+CustomerName);
		System.out.println("Price : "+price);
		System.out.println("---------------------------------------");
	}
}

class PizzaOrder extends OrderDetails{

	PizzaOrder(int orderID, String CustomerName, double price) {
		super(orderID, CustomerName, price);
	}
	
	
	void pizzaOrder() {
		System.out.println("Pizza Order Successfully..");
		System.out.println("---------------------------------------");
	}
	
}

class BurgerOrder extends OrderDetails{

	BurgerOrder(int orderID, String CustomerName, double price) {
		super(orderID, CustomerName, price);
	}
	
	
	void burgerOrder() {
		System.out.println("Burger Order Successfully..");
		System.out.println("---------------------------------------");
	}
	
}
public class TestOrders {

	public static void main(String[] args) {
		PizzaOrder p = new PizzaOrder(101,"Rakesh",220);
		p.display();
		p.pizzaOrder();
		
		BurgerOrder b = new BurgerOrder(102,"Rakesh",150);
		b.display();
		b.burgerOrder();

	}

}

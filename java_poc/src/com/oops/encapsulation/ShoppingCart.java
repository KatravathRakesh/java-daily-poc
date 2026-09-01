package com.oops.encapsulation;

public class ShoppingCart {

	
	private int cartItems;
	private double totalAmount;
	
	
     public void  setCartItems(int cartItems) {
		this.cartItems = cartItems;
	}
     
     public int getCartItems() {
    	 return cartItems;
     }
 
	 int count = 0;
	 public double addItem(double cartItems) {
		 if(cartItems > 0) {
			 totalAmount += cartItems;
			 count++;			 
		 }else {
			 System.out.println("Invalid CartItems Entered !");
		 }
		 
		 return totalAmount;
	 }
	 
	 public double removeItem(double cartItems) {
		 if(totalAmount >= cartItems) {
			 totalAmount -= cartItems;
			 count--;
		 }else {
			 System.out.println("Insufficient Amount!");
		 }
		 return totalAmount;
	 }
	 
	 public double getTotalAmount() {
		 return totalAmount;
	 }
     
	 
     
}

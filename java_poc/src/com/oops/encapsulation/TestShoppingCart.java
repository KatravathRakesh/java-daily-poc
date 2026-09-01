package com.oops.encapsulation;

public class TestShoppingCart {

	public static void main(String[] args) {
		ShoppingCart sc = new ShoppingCart();
		
		System.out.println("Total Amount : "+sc.getTotalAmount());
		sc.addItem(2000);
		sc.addItem(37500);
		sc.addItem(3790);
		System.out.println("Total  CartItems After Adding : "+sc.count);
		System.out.println("Total Amount : "+sc.getTotalAmount());
		sc.removeItem(4000);
		System.out.println("Total CartItems After Removing : "+sc.count);
		System.out.println("Total Amount : "+sc.getTotalAmount());

	}

}

package com.nested_if_else_statement_poc;

import java.util.*;
//Apply discount based on membership and purchase amount.
public class OnlineShoppingDiscount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the membership yes->y / No ->n : ");
		String member = s.next();
		System.out.print("Enter the amount : ");
		double amount = s.nextDouble();
		
		double discount;
		
		if(member.equalsIgnoreCase("y")) {
			if(amount >= 5000) {
				discount = amount*0.20;
			}else {
				discount = amount*0.10;
			}
		}else {
			if(amount >= 5000) {
				discount = amount*0.10;
			}else {
				discount = 0;
			}
		}
		System.out.println("Discount : "+discount);
	}

}

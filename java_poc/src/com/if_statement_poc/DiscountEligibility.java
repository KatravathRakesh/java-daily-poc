package com.if_statement_poc;

import java.util.*;

//Print "Discount Applied" if the purchase amount is above ₹5000.
public class DiscountEligibility {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the amount : ");
		double amount = s.nextDouble();
		
		if(amount > 5000) {
			System.out.println("Discount Applied");
		}
		
		
	}

}



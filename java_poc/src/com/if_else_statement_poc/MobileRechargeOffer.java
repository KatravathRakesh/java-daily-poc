package com.if_else_statement_poc;

import java.util.*;
//Show offer availability based on recharge amount.
public class MobileRechargeOffer {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		int amount  = s.nextInt();
		if(amount > 499) {
			System.out.println("Offer is availability based on your amount.");
		}else {
			System.out.println("Offer is not availability based on your amount.");
		}
	}
}

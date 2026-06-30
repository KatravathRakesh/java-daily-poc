package com.if_statement_poc;

import java.util.*;

//Check whether the order qualifies for free delivery.
public class FreeDeliveryCheck {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the range / distance you delivery : ");
		int distance = s.nextInt();
		
		if(distance <=10 ) {
			System.out.println("Order qualifies for free delivery.");
		}

	}

}



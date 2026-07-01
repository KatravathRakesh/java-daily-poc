package com.if_else_statement_poc;

import java.util.*;
//Display Domestic or Commercial based on the connection type.
public class ElectricityBillCategory {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Connection : ");
		
		char ch = s.next().charAt(0);
		if(ch == 'D') {
			System.out.println("Domestic is  based on the Connection.");
		}else {
			System.out.println("Commercial is  based on the Connection.");
		}

	}

}

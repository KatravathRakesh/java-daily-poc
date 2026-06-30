package com.if_statement_poc;

import java.util.*;

//Print "Tax Applicable" if income is above the given limit.
public class TaxApplicable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the yearly income : ");
		long income = s.nextLong();
		
		if(income > 600000) {
			System.out.println("Tax Applicable");
		}

	}

}



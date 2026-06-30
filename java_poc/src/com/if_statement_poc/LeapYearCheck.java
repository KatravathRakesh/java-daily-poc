package com.if_statement_poc;

import java.util.*;

//Check whether a year is a leap year (using only if).
public class LeapYearCheck {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the year : ");
		int year = s.nextInt();
		
		if((year%4 == 0 && year%100 !=100) || (year%400 == 0 )){
			System.out.println("Given year is a leap year.");
		}

	}

}

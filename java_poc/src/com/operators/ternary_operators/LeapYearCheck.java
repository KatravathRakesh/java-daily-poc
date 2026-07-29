package com.operators.ternary_operators;

import java.util.Scanner;

//Check whether a year is a leap year.
public class LeapYearCheck {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the year : ");
		int n = s.nextInt();
		
		String leap = ((n%4 == 0 && n%100 !=0) || n%400 ==0)? "Leap Year":"Not Leap Year";
		
		System.out.println("Give year is : "+leap);

	}

}

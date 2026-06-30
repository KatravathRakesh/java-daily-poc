package com.if_statement_poc;

import java.util.*;

//Check whether age is 60 or above.
public class SeniorCitizenCheck {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the age : ");
		int age = s.nextInt();
		
		if(age >= 60) {
			System.out.println("Your Senior Citizen .");
		}

	}


}




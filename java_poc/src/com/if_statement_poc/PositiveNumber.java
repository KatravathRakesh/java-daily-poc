package com.if_statement_poc;

import java.util.*;

//Check whether a number is positive.
public class PositiveNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the num : ");
		int num = s.nextInt();
		
		if(num >=0) {
			System.out.println("Positive number !");
		}
		

	}

}

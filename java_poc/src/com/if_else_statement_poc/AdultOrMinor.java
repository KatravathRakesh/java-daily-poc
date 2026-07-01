package com.if_else_statement_poc;

import java.util.*;
//Check whether a person is an adult or a minor.
public class AdultOrMinor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Age : ");
		int age = s.nextInt();
		if(age <18) {
			System.out.println("A person is an Minor");
		}else {
			System.out.println("A person is an Adult");
		}

	}

}

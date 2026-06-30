package com.if_statement_poc;

import java.util.*;

//Check whether a character is uppercase.
public class UpperCaseCheck {

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		System.out.print("Enter character letter : ");
		char ch = s.next().charAt(0);
		if(ch >= 'A' && ch <='Z') {
			System.out.println("Given character is uppercase !");
		}
		
		
//		for Lowercase 
//		if(ch >= 'a' && ch <='z') {
//			System.out.println("Given character is uppercase !");
//		}

	}

}

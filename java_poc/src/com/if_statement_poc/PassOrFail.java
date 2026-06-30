package com.if_statement_poc;

import java.util.*;

//Print "Pass" if marks are greater than or equal to 35.
public class PassOrFail {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the marks : ");
		int marks = s.nextInt();
		
		if(marks >=35) {
			System.out.println("Pass");
		}
		
	}

}

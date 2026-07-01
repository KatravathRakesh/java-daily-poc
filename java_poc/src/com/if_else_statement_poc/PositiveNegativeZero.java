package com.if_else_statement_poc;

import java.util.*;
//Check whether a number is positive, negative, or zero.
public class PositiveNegativeZero {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the num : ");
		int num = s.nextInt();
	
		if(num >=0) {
			if(num == 0) {
				System.out.println("Zero Number");
			}else {
				System.out.println("Positive Number");
			}
		}else {
			System.out.println("Negative Number");
		}

	}

}

package com.if_else_statement_poc;

import java.util.*;
//Check whether a number is positive or negative.
public class PositiveNegative {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = s.nextInt();
		
		if(num > 0) {
			System.out.println("Positive Number : "+num);
		}else {
			System.out.println("Negative Number : "+num);
		}

	}

}

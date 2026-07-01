package com.if_else_statement_poc;

import java.util.*;
//Check whether a number is even or odd.
public class EvenOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = s.nextInt();
		
		if(num%2 == 0) {
			System.out.println("Even Number : "+num);
		}else {
			System.out.println("Odd Number : "+num);
		}
	}

}

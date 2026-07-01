package com.if_else_statement_poc;

import java.util.*;
//Find the greater of two numbers.
public class GreaterOfTwoNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the num1 : ");
		int num1 = s.nextInt();
		System.out.print("Enter the num2 : ");
		int num2 = s.nextInt();
		
		if(num1 > num2) {
			System.out.println(num1+" is Greater number");
		}else {
			System.out.println(num2+" is Greater number");
		}
	}

}

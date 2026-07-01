package com.if_else_statement_poc;

import java.util.*;
//Check whether a number is divisible by both 2 and 3.
public class DivisibleByTwoAndThree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Num : ");
		int num = s.nextInt();
		if(num%2 == 0 && num%3 == 0) {
			System.out.println(num+" is divisible by both 2 and 3");
		}else {
			System.out.println(num+" is not divisible by both 2 and 3");
		}

	}

}

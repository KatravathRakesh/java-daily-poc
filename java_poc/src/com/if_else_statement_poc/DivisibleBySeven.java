package com.if_else_statement_poc;

import java.util.*;
//Check whether a number is divisible by 7.
public class DivisibleBySeven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num = s.nextInt();
		if(num%7 == 0) {
			System.out.println("Divisible by 7 ");
		}else {
			System.out.println("Not Divisible by 7 ");
		}
		

	}

}

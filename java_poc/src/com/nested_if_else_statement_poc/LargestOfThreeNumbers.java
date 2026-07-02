package com.nested_if_else_statement_poc;

import java.util.*;
//Find the largest among three numbers using nested if-else.
public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the A value :");
		int a = s.nextInt();
		System.out.print("Enter the B value :");
		int b = s.nextInt();
		System.out.print("Enter the C value :");
		int c = s.nextInt();
		
		if(a > b) {
			if(c > a) {
				System.out.println("C is largest among three number.");
			}else {
				System.out.println("A is largest among three number.");
			}
		}else {
			if(b > c) {
				System.out.println("B is largest among three number.");
			}else {
				System.out.println("C is largest among three number.");
			}
		}
	}

}

package com.for_loop_poc;

import java.util.Scanner;

//Find the factorial of a number.
public class FactorialFor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Num : ");
		int n = s.nextInt();
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact *= i ;
		}
		System.out.println("Factorial : "+fact);

	}

}

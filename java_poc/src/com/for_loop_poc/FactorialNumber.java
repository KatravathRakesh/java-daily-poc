package com.for_loop_poc;

import java.util.Scanner;

//Example:
//5! = 5 × 4 × 3 × 2 × 1 = 120
public class FactorialNumber {

	static int factorial(int n) {
		int fact  = 1;
		for(int i=1;i<=n;i++) {
			fact *= i;
		}
		
		return fact;
	} 
	
//	or
//	recursion 
	
	static int fact(int n) {
		if(n ==0 || n== 1) {
			return 1;
		}
		return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many number want to print :  ");
		int n = s.nextInt();
		
		int fact = factorial(n);
		System.out.println("Factorial of "+n+" is : "+fact);
		
		s.close();

	}

}

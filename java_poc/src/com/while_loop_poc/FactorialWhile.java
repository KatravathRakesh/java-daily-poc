package com.while_loop_poc;

import java.util.Scanner;

//Find the factorial of a number.
public class FactorialWhile {
	
	static int fact(int n) {
		//base case
		int fact = 1;
		if(n == 0 || n ==1) {
			return fact;
		}
		
		while(n >= 2) {
			fact *=n;
			n--;
		}
		
		return fact;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the nth Factorial number : ");
		int n = s.nextInt();
		
		int Factorial = fact(n);
		System.out.println("Factorial of "+n+" : "+Factorial);
		
	}

	
}

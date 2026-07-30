package com.operators.ternary_operators;

import java.util.Scanner;

public class AddtionandSubtract {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the A value : ");
		int a = s.nextInt();
		System.out.print("Enter the B value : ");
		int b = s.nextInt();
		System.out.print("Enter the Operator value : ");
		char op = s.next().charAt(0);
		
		int result = (op == '+')?(a+b):(a-b);// imp****
		
		System.out.println("Given result is : "+result);

		s.close();
	}

}

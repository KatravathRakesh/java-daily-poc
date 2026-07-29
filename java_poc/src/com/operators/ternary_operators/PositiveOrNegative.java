package com.operators.ternary_operators;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		
		String pn = (n<0)? "Negative":"Positive";
		
		System.out.println("Give number is : "+pn);

	}

}

package com.operators.ternary_operators;

//Find the largest of two numbers using the ternary operator.
public class LargestAndSmallerOfTwo {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		int max = (a > b) ? a : b;
		int min = (a < b) ? a : b;

		System.out.println("Largest Number : " + max);
		System.out.println("Smaller Number : " + min);
	}

}

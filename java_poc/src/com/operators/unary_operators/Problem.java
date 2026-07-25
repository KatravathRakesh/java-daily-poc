package com.operators.unary_operators;

//Unary Operators (++, --, +, -, !)

public class Problem {

	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		
		//Demonstrate pre-increment.
		System.out.println(++a);//5
		//Demonstrate post-increment.
		System.out.println(a++);//5 -> internal a = 6
		//Demonstrate pre-decrement.
		System.out.println(--b);//4
		System.out.println(--a);//5
		//Demonstrate post-decrement.
		System.out.println(b--);//4 -> internal b = 3
		System.out.println(a--);//5 -> internal a = 4
		//Convert positive number to negative.
		System.out.println(-a);//-4
		
		//Convert negative number to positive.
		System.out.println(+b);//3
		
		//Toggle a boolean value using !.
		System.out.println(!true);//false
		

	}

}

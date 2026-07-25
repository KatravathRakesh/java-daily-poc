package com.operators.arithmetic_operators;
//Swap two numbers without a third variable.

public class SwapWithoutThridvar {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		System.out.println("--------Befor Swap--------");
		System.out.println("A Number : " + a);
		System.out.println("B Number : " + b);

		a = a+b;//15
		b = a-b;//15-5 =10
		a = a-b;//15-10 =5
		
		System.out.println("--------After Swap--------");
		System.out.println("A Number : "+a);
		System.out.println("B Number : "+b);

	}

}

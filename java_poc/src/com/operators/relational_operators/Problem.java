package com.operators.relational_operators;
//Relational Operators (==, !=, >, <, >=, <=)

public class Problem {

	public static void main(String[] args) {
		int a =10;
		int b =22;
		
		//Check whether two numbers are equal.
		System.out.println(a == b);//false
		System.out.println(a != b);//true
		//Find the greater of two numbers.
		System.out.println(a > b);//false
		//Find the smaller of two numbers.
		System.out.println(a < b);//true
		
		int marks = 58;
		//Check whether a student passed (marks ≥ 35).
		System.out.println(marks >= 35);//true
		
		int age = 22;
		//Check voting eligibility (age ≥ 18).
		System.out.println(age <= 18);//false
		
		//Check whether a number is greater than 100.
		System.out.println(a > 100);//false
		

	}

}

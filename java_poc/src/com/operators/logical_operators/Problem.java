package com.operators.logical_operators;

//Logical Operators (&&, ||, !)


public class Problem {

	public static void main(String[] args) {
		int num = 30;
		
		//Check if a number is between 1 and 100;
		System.out.println(num > 0 && num < 100);// false
		//Check if a person is eligible for a job (age ≥ 18 && degree completed).
		
		int age =22;
		String status = "Pass";
		
		System.out.println(age >= 18 && status.equalsIgnoreCase("Pass"));//true
		//Check if a student passed all subjects.
		String exam = "Pass";
		System.out.println(exam.equalsIgnoreCase("Not Pass"));
		//Check whether a character is a vowel.
		char ch = 'A';
		System.out.println(ch == 'A' || ch == 'E'|| ch == 'I' || ch == 'O' || ch == 'U');
		//Check leap year conditions.
		System.out.println("---------------------------");
		int year = 400;
		System.out.println(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0));
		//Check if a number is divisible by both 3 and 5.
		System.out.println("********************");

		System.out.println(num % 3 == 0 && num % 5 ==0);//true
		
		
		System.out.println("----------------------------------------------");
		System.out.println(true || true);// 2nd postion dead code //true
		System.out.println(true || false);// 2nd postion dead code//true
		System.out.println(false || true);//true
		System.out.println(false || false);//false
		
		System.out.println("----------------------------------------------");
		System.out.println(!true);// false
		System.out.println(!false); //true
		
		System.out.println("----------------------------------------------");
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(false && true);//false  2nd postion dead code//true
		System.out.println(false && false);//false  2nd postion dead code//true
		
		
		int a =1;
		int b = 2;
		
//		System.out.println(a++ > ++b && a++ < b--);//false
		System.out.println(--a <++b || a++ < b--);//true
		System.out.println(a);//2-->1-->0
		System.out.println(b);//3-->2 -->3

		
		

	}

}

package com.for_loop_poc;

import java.util.Scanner;

public class PalindromeNumber {

	static void Palindrome(int n) {
		int digit = 0;
		int reverse = 0;
		int n1 = n;
		
		for(int i =n; i>0;i = i/10) {
			digit = i%10;
			reverse = (reverse*10) +digit;
			
		}
		if(reverse == n1) {
			System.out.println("Given Number is Palindrome "+n1);
		}else {
			System.out.println("Given Number is not Palindrome "+n1);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = s.nextInt();
		
		Palindrome(n);
		
		s.close();

	}

}

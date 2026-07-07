package com.while_loop_poc;

import java.util.Scanner;

//Check whether a number is a palindrome.
//palindrome ==> when we reverse number it should be same
// 121 -> palindrome, 123 -> not palindrome

public class PalindromeNumberWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = s.nextInt();
		int r = 0;
		int reverse = 0;
		int n1 = n;
		
		while(n >0) {
			r = n % 10;
			reverse = (reverse*10) +r;
			n = n /10;
		}
		
		if(reverse == n1) {
			System.out.println("Given Number "+n1+" is a Palindrome");
		}else {
			System.out.println("Given Number "+n1+" is not a Palindrome");
		}
		
		
	}

}

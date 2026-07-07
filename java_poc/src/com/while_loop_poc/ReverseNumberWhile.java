package com.while_loop_poc;

import java.util.Scanner;

//Reverse a given number.
// 1234 --> 4321  will be reverse num
public class ReverseNumberWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number which you want to reverse : ");
		int n = s.nextInt();
		int r =0;//remainder  123 % 10 => 3
		int reverse = 0;
		
		while(n>0) {
			r = n % 10;//123 % 10 => 3
			reverse = (reverse*10) + r; // reverse = 2, then 2*10 + 3 ==> 23
			n = n/10; // 123/10 => 12
		}
		System.out.println("Given number in Reverse Order : "+reverse);
	}

}

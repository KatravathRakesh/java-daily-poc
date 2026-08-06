package com.for_loop_poc;

import java.util.Scanner;

public class FirstDigit {
	
	static int firstDigit(int n) {
		int digit = 0;
		int fd = 0;
		
		for(int i=n;i>0;i = i/10) {
			digit = i%10;
			fd = digit;
		}
		
		return fd;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		
		int fd = firstDigit(n);
		System.out.println("First Digit in Given Number : "+fd);
		
		s.close();
	}

}

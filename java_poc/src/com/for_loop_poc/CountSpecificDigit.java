package com.for_loop_poc;

import java.util.Scanner;

//Q)Write a Java program to count how many times a specific digit occurs in a given number.
//Number = 1223342
//Specific digit = 2
//Output = 3
//
//Because 2 occurs 3 times.
public class CountSpecificDigit {

	static int countSpecificDigit(int n,int sd) {
		int count = 0;
		int r = 0;
		
		for(int i=n;i>0;i=i/10) {
			r = i%10;//123%10 ->3
			if(r == sd) {
				count++;
			}
			
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		System.out.print("Enter the Specific Digit : ");
		int sd = s.nextInt();

		int count = countSpecificDigit(n,sd);
		System.out.println("Given Number Total Specifi Digit count : " + count);
		s.close();

	}

}

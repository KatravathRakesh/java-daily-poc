package com.for_loop_poc;

import java.util.Scanner;

//Q)Given a number and a specific digit, remove all occurrences of that digit from the number.
//
//Example
//Number = 1223342
//Digit = 2
//
//Output = 1334
//
//All 2s are removed.
public class RemoveAllOccurrences {

	static int removeOccurrences(int n, int digit) {
		int rev = 0;
		int r = 0;
		int num =0;
		for(int i=n;i>0;i=i/10) {
			r = i%10;
			if(r == digit) {
				continue;
			}
			rev = rev*10+r;
		}
		
		for(int i=rev;i>0;i=i/10) {
			r = i%10;
			num = num*10 +r;
		}
		return num;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		System.out.print("Enter the Digit Want to remove : ");
		int digit = s.nextInt();

		int num = removeOccurrences(n, digit);
		System.out.println("After remove All given digit Occurrences : " + num);

		s.close();

	}

}

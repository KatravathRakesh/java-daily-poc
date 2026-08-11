package com.for_loop_poc;

import java.util.Scanner;

//Q)Given a number, replace every occurrence of one digit with another digit.
//
//Example
//Number = 1223342
//Old digit = 2
//New digit = 9
//
//Output = 1993349
//
//Every 2 is replaced with 9.
public class ReplaceDigit {

	static int replaceDigit(int n,int oldDigit, int newDigit) {
		int r = 0;
		int rev = 0;
		int num = 0;
		for(int i=n;i>0;i=i/10) {
			r = i%10;
			if(r == oldDigit) {
				r = newDigit;
			}
			
			rev = rev*10 +r;
		}
		
		for(int i= rev;i>0;i=i/10) {
			r = i%10;
			num = num*10 +r;
		}
		
		
		return num;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();
		System.out.print("Enter digit which digit want to replace in given Number : ");
		int oldDigit = s.nextInt();
		System.out.print("Enter New digit to replace with old digit : ");
		int newDigit = s.nextInt();
		
		int num = replaceDigit(n,oldDigit,newDigit);
		System.out.println("Replace Digit with New Digit : "+num);
		s.close();

	}

}

package com.while_loop_poc;

import java.util.Scanner;

//Example: 1023
//
//Digits:
//
//1 → 0 → 2 → 3
//
//Since the number contains 0:
//
//✅ 1023 is a Duck Number.
public class DuckNumber {

	static boolean isDuckNum(int n) {
		boolean flag = false;
		
		int r= 0;
		
		while(n>0) {
			r =n%10;
			if(r == 0) {
				flag = true;
				break;
			}
			
			n = n/10;
			
		}
		
		return flag;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = s.nextInt();
		
		if(isDuckNum(n)) {
			System.out.println("Given Number is Duck Number is "+n);
		}else {
			System.out.println("Given Number is not Duck Number is "+n);
		}
		s.close();

	}

}

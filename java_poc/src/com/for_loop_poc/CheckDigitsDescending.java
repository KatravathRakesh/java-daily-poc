package com.for_loop_poc;

import java.util.Scanner;

public class CheckDigitsDescending {
	static boolean isDescending(int n) {
		boolean flag = true;

		int rev = 0;
		int r = 0;
		int digit = 9;
		for(int i=n;i>0;i=i/10) {
			r = i%10;
			
			rev = rev*10+r;
		}
		
		for(int i=rev;i>0;i=i/10) {
			r = i%10;
			if(r<=digit) {
				digit = r;
			}else {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = s.nextInt();

		if(isDescending(n)) {
			System.out.println("Given Number is in Descending : "+n);
		}else {
			System.out.println("Given Number is not in Descending : "+n);
		}
		
		s.close();

	}
}

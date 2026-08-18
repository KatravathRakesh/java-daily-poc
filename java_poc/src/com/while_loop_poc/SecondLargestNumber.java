package com.while_loop_poc;

import java.util.Scanner;

public class SecondLargestNumber {

	static int secondMaxNum(int n) {
		int r = 0;
		int max = 0;
		int rev = 0;
		int secmax = 0;
		int temp = n;
		
		while (n > 0) {
			r = n % 10;
			if (max < r) {
				max = r;
			}
			n = n / 10;
		}
		
		while(temp > 0) {
			r = temp%10;
			temp = temp/10;
			
			if(max == r) {
				continue;
			}
			rev = rev*10 + r;
			
		}
		
		while(rev > 0) {
			r = rev%10;
			if(secmax < r) {
				secmax = r;
			}
			
			rev = rev/10;
		}
		
		return secmax;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = s.nextInt();// 7839

		int secmax = secondMaxNum(n);
		
		System.out.println("Second Largest Number : "+secmax);
		s.close();

	}

}

package com.for_loop_poc;

import java.util.Scanner;

public class SecondLargestDigit {

	static  int findSecondLargest(int n) {
		int secmax = 0;
		int max = 0;
		int r = 0;
		int rev = 0;
		for(int i=n;i>0;i=i/10) {
			r = i%10;
			if(r >max) {
				max = r;
			}
			
		}
		for(int i=n;i>0;i= i/10) {
			r= i%10;
			if(r == max) {
				continue;
			}
			rev = rev*10+r;
		}
		
		for(int i=rev;i>0;i=i/10) {
			r = i%10;
			if(r > secmax) {
				secmax = r;
			}
		}
		
		
		return secmax;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n =s.nextInt();
		
		
		int secondmax = findSecondLargest(n);
		System.out.println("Given Number the Second Largest Digit : "+secondmax);

		s.close();
	}

}

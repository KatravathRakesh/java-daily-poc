package com.for_loop_poc;

import java.util.Scanner;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many number want to print : ");
		int n = s.nextInt();
		
		System.out.print("Prime Number : ");
		for(int i =1;i<=n;i++) {
			if(isprime(i)) {
				System.out.print(i+" ");
			}
		}
		
		s.close();

	}
	static boolean isprime(int n) {
		boolean flag = true;
		
		if(n==0 || n == 1) {
			return false;
		}
		
		for(int i=2;i<n;i++) {
			if(n%i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

}

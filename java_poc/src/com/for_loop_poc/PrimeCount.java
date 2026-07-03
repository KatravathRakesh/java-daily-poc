package com.for_loop_poc;

import java.util.Scanner;

//Count the prime numbers between 1 and N.
public class PrimeCount {

	static boolean isprime(int n) {
		boolean flag = true;
		if(n==0 || n==1) {
			flag = false;
		}
		
		for(int i=2;i<=n/2;i++) {
			if(n%i == 0) {
				flag = false;
				break;
			}
		}
		
		return flag;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the nth number : ");
		int n = s.nextInt();
		
		int count =0;
		for(int i=1;i<=n;i++) {
			if(isprime(i)) {
				count++;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		System.out.println("Prime Number count : "+count);
	}

}

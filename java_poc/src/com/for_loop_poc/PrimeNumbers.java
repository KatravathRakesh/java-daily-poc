package com.for_loop_poc;

import java.util.Scanner;

//Print all prime numbers between 1 and N.
public class PrimeNumbers {

	static boolean isPrime(int n) {
		boolean flag = true;
		if(n ==0 || n == 1) {
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
		System.out.print("Enter thge Num : ");
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}

	}

	
}

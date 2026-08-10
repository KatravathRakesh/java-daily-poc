package com.for_loop_poc;

import java.util.Scanner;

public class CountPrimeNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("how many prime number want to print : ");
		int n = s.nextInt();
		int count = 0;
		for(int i=0;i<=n;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Total Count of Prime Number : "+count);
		
		s.close();
	}
	
	static boolean isPrime(int n) {
		boolean flag = true;
		
		if(n == 0 || n == 1) {
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

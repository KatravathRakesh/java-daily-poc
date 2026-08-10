package com.for_loop_poc;

import java.util.Scanner;

public class TargetPrimeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("how many prime number want to print : ");
		int n = s.nextInt();
		System.out.print("Enter the Target : ");
		int target = s.nextInt();
		for(int i=0;i<=n;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		for(int i=0;i<=n;i++) {
			if(isPrime(i)) {
				if(target == i) {
					System.out.println("Given Target Prime Number : "+target);
					break;
				}
			}
		}
		
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

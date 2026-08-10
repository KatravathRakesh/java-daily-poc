package com.for_loop_poc;

import java.util.Scanner;

public class EvenIndexPrimeNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter how many number want to Print : ");
		int n = s.nextInt();
		int primeIndex = 0;
		System.out.println("Prime Numbers : ");
		for (int i = 0; i <= n; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}

		}
		System.out.println();
		System.out.println("----------------------------");
		System.out.println("Even Index Prime Numbers : ");
		for (int i = 0; i <= n; i++) {
			if (isPrime(i)) {
				if (primeIndex % 2 == 0) {
					System.out.print(i + " ");
				}
				primeIndex++;
			}

		}

		s.close();

	}

	static boolean isPrime(int n) {
		boolean flag = true;

		if (n == 0 || n == 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = false;
			}
		}
		return flag;
	}

}

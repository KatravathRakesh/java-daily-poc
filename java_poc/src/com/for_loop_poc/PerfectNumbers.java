package com.for_loop_poc;

import java.util.Scanner;

//Check whether a given number is a Perfect Number
//6 --> divisor --> 1,2,3 == 1+2+3 =6
//28 --> divisor -->  1 + 2 + 4 + 7 + 14 = 28
public class PerfectNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the nth number : ");
		int n = s.nextInt();
		int sum =0;
		for(int i=1;i<=n/2;i++) {
			if(n%i == 0) {
				sum +=i;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		if(sum == n) {
			System.out.println("Given number is a Perfect number : "+n);
		}else {
			System.out.println("Given number is not a Perfect number : "+n);
		}

	}

}

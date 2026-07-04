package com.while_loop_poc;

import java.util.Scanner;

//Find the sum of the first N natural numbers.
public class SumOfNNumbersWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the nth Number : ");
		int n = s.nextInt();
		int sum = 0;
		int i =1;
		while(i<=n) {
			sum += i;
			i++;
		}
		System.out.println("Sum Of Nth Numbers : "+sum);
	}

}

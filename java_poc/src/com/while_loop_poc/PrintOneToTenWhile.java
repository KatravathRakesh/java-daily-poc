package com.while_loop_poc;

import java.util.Scanner;
//Print numbers from 1 to 10.
public class PrintOneToTenWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the nth number : ");
		int n = s.nextInt();
		
		int i =1;
		while(i<=n) {
			System.out.print(i+ " ");
			i++;
		}

	}

}

package com.while_loop_poc;

import java.util.Scanner;
//Print numbers from 10 to 1.
public class PrintTenToOneWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the nth number : ");
		int n = s.nextInt();
		
		while(n>=1) {
			System.out.print(n+ " ");
			n--;
		}


	}

}

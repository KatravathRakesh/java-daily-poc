package com.while_loop_poc;

import java.util.Scanner;

//Print odd numbers from 1 to 100.
public class OddNumbersWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the nth number : ");
		int n = s.nextInt();
		
		int i =1;
		while(i<=n) {
			if(i%2 != 0) {
				System.out.print(i+" ");
			}
			i++;
		}


	}

}

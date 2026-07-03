package com.for_loop_poc;

import java.util.Scanner;

//Print numbers from 1 to 100 with their squares.
public class SeriesOneToHundred {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Start Number : ");
		int n = s.nextInt();
		System.out.print("Enter the End Number : ");
		int m = s.nextInt();
		
		for(int i=n;i<=m;i++) {
			System.out.print(i*i+" ");
		}
	}

}

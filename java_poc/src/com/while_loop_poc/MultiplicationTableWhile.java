package com.while_loop_poc;

import java.util.Scanner;

//Print the multiplication table of a number.
public class MultiplicationTableWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the nth number : ");
		int n = s.nextInt();
		System.out.print("Enter the Multiple number : ");
		int m = s.nextInt();
		
		int i =1;
		while(i<=n) {
			System.out.println(m+" X "+i+" = "+ m*i);
			i++;
		}
		
		
	}

}

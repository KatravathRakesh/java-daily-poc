package com.while_loop_poc;

import java.util.Scanner;

//Print the Fibonacci series using a while loop.

//0 1 1 2 3 5 8
//n1 n2
public class FibonacciWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the nth number : ");
		int n = s.nextInt();
		
		int n1 = 0;
		int n2 = 1;
		
		System.out.print(n1+" "+n2+" ");
		
		while(n>0) {
			int n3 = n1 +n2;
			System.out.print(n3+" ");
			n1 = n2;
			n2 = n3;
			n--;
		}
		

	}

}

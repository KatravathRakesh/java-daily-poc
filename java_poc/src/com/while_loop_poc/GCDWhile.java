package com.while_loop_poc;

import java.util.Scanner;

//Find the GCD of two numbers.
public class GCDWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the n1 : ");
		int n1 = s.nextInt();
		System.out.print("Enter the n2 : ");
		int n2 = s.nextInt();
		
		int min =0;
		if(n1< n2) {
			min = n1;
		}else {
			min = n2;
		}
		
		int i=1;
		int gcd =1;
		
		System.out.print("Common multiple : ");
		while(i<=min) {
			if(n1 % i ==0 && n2 % i == 0) {
				System.out.print(i+" ");
				gcd =i;
			}
			i++;
		}
		System.out.println();
		
		System.out.println("GCD of two numbers : "+gcd);
	}

}

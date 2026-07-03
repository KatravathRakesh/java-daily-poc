package com.for_loop_poc;

import java.util.Scanner;

//Find the sum of odd numbers from 1 to N.
public class SumOfOddNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the nth number : ");
		int n = s.nextInt();
	    int sum =0;
	    System.out.print("Odd Number : ");
	    for(int i=1;i<=n;i++) {
	    	if(i%2 != 0) {
	    		System.out.print(i+" ");
	    		sum += i;
	    		
	    	}
	    }
	    System.out.println();
	    
	    System.out.print("Sum of N Odd number : "+sum);
	
	}

}

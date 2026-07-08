package com.while_loop_poc;

import java.util.Scanner;

//Count the even numbers between 1 and N.
public class CountEvenNumbersWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the nth number : ");
		int n = s.nextInt();
		int count =0;
		int i =1;
		System.out.print("Even Number : ");
		 while(i<=n) {
			 if(i%2 == 0) {
				 System.out.print(i+" ");
				 count++;
			 }
			 i++;
		 }
		 System.out.println();
		 System.out.println("Total Even Number : "+count);

	}

}

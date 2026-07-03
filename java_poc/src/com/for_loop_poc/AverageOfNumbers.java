package com.for_loop_poc;

import java.util.Scanner;

//Find the average of N numbers.
public class AverageOfNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the nth number : ");
		int n = s.nextInt();
		int sum = 0;
		int count =0;
		
		
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
			sum += i;
			count++;
		}
		
		System.out.println();
		float Average = (float)sum/count;
		System.out.print("Average Of Numbers : "+Average);
		

	}

}

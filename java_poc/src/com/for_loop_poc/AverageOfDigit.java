package com.for_loop_poc;

import java.util.Scanner;

public class AverageOfDigit {

	static int AvgDigit(int n) {
		int digit = 0;
		int sum = 0;
		int count =0;
		
		
		for(int i=n;i>0;i= i/10) {
			digit = i%10;
			sum += digit;
			count++;
			
		}
		
		double avg = sum/count;
		
		return (int)avg;
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = s.nextInt();
		
		double avg = AvgDigit(n);
		System.out.println("Average Digit of Given Digit :  "+avg);
		
		s.close();

	}

}

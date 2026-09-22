package com.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {

	public static void main(String[] args) {
		System.out.println("main method Started");
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e1) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			System.out.println(e1.toString());
		}
		
		
		
		try {
			double am = Double.parseDouble("amount");
			System.out.println(am);
			
		}catch(NumberFormatException e2) {
//			NumberFormatException
			System.out.println(e2.toString());

		}
		
		
		
		try {
			int[] arr = {1,2,3,4,5};
			
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > arr[i+1]) {
				System.out.println("Swap");
			}
		}
			
		}catch(ArrayIndexOutOfBoundsException e3) {
//			
			System.out.println(e3.toString());

		}
		
		
		
		
		try {
			System.out.print("Enter the Number : ");
			int num = s.nextInt();
			System.out.println(num);
		}catch(InputMismatchException e4) {
			System.out.println(e4.toString());
		}
		
		try {
			String name = null;
			System.out.println(name.length());
		}catch(NullPointerException e5) {
			System.out.println(e5.toString());
		}finally {
			s.close();
		}
		System.out.println("main method ended");
		
	
		
	}

}

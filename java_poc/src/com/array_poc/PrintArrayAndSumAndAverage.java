package com.array_poc;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArrayAndSumAndAverage {

	static Scanner s = new Scanner(System.in);
	
	static void printArray(int[] arr,int size) {

		System.out.println("Enter the Array Element : ");
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}

		System.out.print("Print Array list : ");
		System.out.println(Arrays.toString(arr));

	}
	

	static int sumElement(int[] arr) {
		int sum = 0;
		
		for(int a: arr) {
			sum += a;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.print("Enter the size : ");
		int size = s.nextInt();
		int[] arr = new int[size];
		
		printArray(arr,size);
		
		System.out.println();
		
		int sum = sumElement(arr);
		System.out.println("Sum of Element in Array :  "+sum);
		
		int avg = sum/arr.length;
		System.out.println("Average of Element in Array : "+avg);
		
		
		

	}

}

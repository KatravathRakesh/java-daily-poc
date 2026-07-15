package com.array_poc;

import java.util.Scanner;

//Find the sum of all elements
public class SumOfElements_2DArray {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		
		arr[0][0] = 3;
		arr[1][1] = 3;
		arr[2][2] = 3;
		
		int sum =0;
		
		
		for(int arr1[] : arr) {
			for(int a : arr1) {
				
				System.out.print(a+" ");
				sum += a;
			}
			System.out.println();
		}
		System.out.println("Sum of Element : "+sum);

	}

}

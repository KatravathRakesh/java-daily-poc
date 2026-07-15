package com.array_poc;

import java.util.Scanner;

//Find the average of all elements
public class AverageOfElements {

	public static void main(String[] args) {
        int[][] arr = new int[3][3];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		
		int sum =0;
		
		
		for(int arr1[] : arr) {
			for(int a : arr1) {
				
				System.out.print(a+" ");
				sum += a;
			}
			System.out.println();
		}
		
		double avg = sum/arr.length;
		System.out.println("Average of Element : "+avg);

	}

}

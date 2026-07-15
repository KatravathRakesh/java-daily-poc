package com.array_poc;

import java.util.Scanner;

//Create and print a 2D array
//Read a 2D array from the user
//Display all elements

public class Create2DArray {

	public static void main(String[] args) {
		Scanner s =new  Scanner(System.in);
		int[][] arr = new int[3][3];
		
		System.out.println("Enter the 2D Array element : ");
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr[i].length-1;j++) {
				arr[i][j] = s.nextInt();
			}
			System.out.println();
		}
		
		for(int arr1[] : arr) {
			for(int a : arr1) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		

	}

}

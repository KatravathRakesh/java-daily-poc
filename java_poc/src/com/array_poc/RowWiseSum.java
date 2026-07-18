package com.array_poc;

import java.util.Scanner;

//Find the sum of each row
public class RowWiseSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] arr= new int[3][3];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		
		int rowsum = 0;
		for(int arr1[] : arr) {
			for(int a : arr1) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				rowsum += arr[i][j];
				
			}
		}
		
		System.out.print("Sum of Each row : "+rowsum);
	}

}

package com.array_poc;

import java.util.Scanner;

//Find the sum of each row
public class RowWiseSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the row size : ");
		int row = s.nextInt();
		System.out.print("Enter the col size : ");
		int col = s.nextInt();
		
		int[][] arr =new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j] = s.nextInt();
			}
			System.out.println();
		}
		
		
		for(int i=0;i<row;i++) {
			int sum = 0;
			for(int j=0;j<col;j++) {
				sum +=arr[i][j];
			}
			System.out.println("sum of each row "+(i+1)+" : "+sum);
		}
		
	}

}

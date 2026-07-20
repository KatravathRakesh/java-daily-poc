package com.array_poc;

import java.util.Scanner;

//Print a given  row
public class PrintSpecificRow {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the row size : ");
		int row = s.nextInt();
		System.out.print("Enter the col size : ");
		int col = s.nextInt();
		
		int[][] arr = new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j] = s.nextInt();
			}
		}
		
//		for(int arr1[] : arr) {
//			for(int a : arr1) {
//				System.out.print(a+" ");
//			}
//			
//			System.out.println();
//			
//		}
		String ch;
		
		do {
			
			System.out.print("Enter the which row want to print : ");
			int i = s.nextInt();
			if(i>=0 && i<row) {
				for(int j=0;j<col;j++) {
					System.out.print(arr[i][j]+" ");
					
				}
				System.out.println();
			}else {
				System.out.println("Invalid row");
			}
			
			
			System.out.print("Do you want print another row : ");
			ch = s.next();
			
		}while(ch.equals("y"));
		
		

	}

}

package com.array_poc;

import java.util.Scanner;

public class SortEachRow {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the row size : ");
		int row = s.nextInt();
		System.out.print("Enter the col size : ");
		int col = s.nextInt();

		int[][] arr = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = s.nextInt();
			}
		}

		String ch;

		do {
			System.out.print("Enter the which row want to print : ");
			int i = s.nextInt();
			for (int j = 0; j < col/2; j++) {
				if(arr[i][j] > arr[i][j+1]) {
					int temp = arr[i][j];
					arr[i][j] = arr[i][j+1];
					arr[i][j+1] = temp;
				}
				
			}
			
			for(int j = 0; j < col; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
			System.out.print("Do you want print another row : ");
			ch = s.next();
		}while(ch.equalsIgnoreCase("yes"));

	}

}

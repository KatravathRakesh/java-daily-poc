package com.array_poc;

import java.util.Scanner;

//Read and print array elements.
public class ArrayInput {

	 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int n = s.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		
		System.out.print("Array items : ");
		for(int arr1 : arr) {
			System.out.print(arr1+" ");
		}
	}

}

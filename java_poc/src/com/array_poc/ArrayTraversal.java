package com.array_poc;

import java.util.Scanner;

//Traverse an array using a loop.
public class ArrayTraversal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Size of Array : ");
		int n = s.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		
		for(int a : arr) {
			System.out.print(a+" ");
		}

	}

}

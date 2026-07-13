package com.array_poc;

import java.util.Scanner;

//Perform linear search.
public class LinearSearch {
	
	public static void linearSearch(int[] arr, int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				System.out.print("Linear Search Index : "+i);
				return;
			}
		}
		System.out.println("Element not found");
	}
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the key Element : ");
		int key = s.nextInt();
		
		linearSearch(arr,key);
		
		s.close();

	}

}

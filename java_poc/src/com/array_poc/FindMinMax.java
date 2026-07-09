package com.array_poc;

import java.util.Scanner;

//WAP to print Min and Max in a give array list
public class FindMinMax {

	public static void MinMax(int[] n) {
		
		int min = n[0];
		int max = n[0];
		
		for(int n1: n) {
			if(n1 < min) {
				min = n1;
			}else if(n1 > max) {
				max = n1;
			}
		}
		System.out.println("Min Value : "+min);
		System.out.println("Max Value : "+max);
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n = s.nextInt();
		
		int[] arr = new int[n];//n--> size of array
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
			
		}
		
		for(int a :arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		MinMax(arr);

	}

}

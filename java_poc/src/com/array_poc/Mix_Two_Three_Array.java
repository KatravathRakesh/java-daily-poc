package com.array_poc;

import java.util.Scanner;

//Mix two array in thrid array
public class Mix_Two_Three_Array {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the Size of array : ");
		int n = s.nextInt();
		System.out.println("Enter the items in a : ");
		int[] a = new int[n];
		
        for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
		}
		
		System.out.println("Enter the items in b : ");
		int[] b = new int[n];
//		int[] a = {10,20,30};
//		int[] b = {40,50,60};
		
		for(int i=0;i<b.length;i++) {
			b[i] = s.nextInt();
		}
		
		int[] c = new int[a.length + b.length];
		
		for(int i=0;i<a.length;i++) {
			c[i] = a[i];
		}
		
		for(int i=0;i<b.length;i++) {
			c[a.length + i] = b[i];
		}
		System.out.print("Mixture of two array in thrid Array : ");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}

}

package com.array_poc;

import java.util.Scanner;

//Search for an element.
public class SearchElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a[] = {20,30,4,10,33,50};
		
		int n = a.length -1;
		
		System.out.print("Enter the key value to search : ");
		int key = s.nextInt();
		
		
		for(int i=0;i<n;i++) {
			if(a[i] == key) {
				System.out.println("Searching Element : "+a[i]+" Index : "+i);
			}
		}
		
	

	}

}

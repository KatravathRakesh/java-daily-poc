package com.array_poc;

//Reverse an array.
public class ArrayReverse {

	public static void main(String[] args) {
		  int [] a = {10,20,30,40,50,60};
			
			System.out.print("Reverse NUmber : ");
			int n = a.length-1;
			for(int i=n;i>=0;i--) {
				System.out.print(a[i]+" ");
			}
			System.out.println();

	}

}

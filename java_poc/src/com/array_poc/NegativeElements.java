package com.array_poc;

//Print negative numbers.
public class NegativeElements {

	public static void main(String[] args) {
        int [] a = {-3,21,-8,78,92,-9,-45};
		
		System.out.print("Negative NUmber : ");
		for(int i=0;i<a.length;i++) {
			if(a[i]< 0) {
				System.out.print(a[i]+" ");
				
			}
		}
		System.out.println();

	}

}

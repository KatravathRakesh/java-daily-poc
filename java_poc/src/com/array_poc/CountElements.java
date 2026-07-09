package com.array_poc;

//Count total elements.
public class CountElements {

	public static void main(String[] args) {
		int a[]= {1,2,4,5,2,9};
		int count = a.length;
		System.out.print("Array items : ");
		for(int a1 : a) {
			System.out.print(a1+" ");
		}
		System.out.println();
		System.out.println("Count total elements : "+count);

	}

}

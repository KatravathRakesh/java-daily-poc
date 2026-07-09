package com.array_poc;

//Print even elements.
public class EvenElements {

	public static void main(String[] args) {
		int[] a = {2,34,7,91,22,77,10};
		
		int count =0;
		System.out.print("Even Elements : ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 == 0) {
				System.out.print(a[i]+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Count of Even Number : "+count);

	}

}

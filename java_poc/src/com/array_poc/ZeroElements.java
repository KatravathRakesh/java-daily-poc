package com.array_poc;

//Count zeros in an array.
public class ZeroElements {

	public static void main(String[] args) {
		int [] a = {0,21,4,0,-78,9,0,3};
		int count = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i] == 0) {
				count++;
				
			}
		}
		System.out.println();
		System.out.println("Total zeros in an array : "+count);

	}

}

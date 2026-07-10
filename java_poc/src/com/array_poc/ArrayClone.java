package com.array_poc;

//Clone an array.
public class ArrayClone {

	public static void main(String[] args) {
		String[] a = {"banana","Apple","Mango"};
		
		String[] b = new String[3];
		
		for(int i=0;i<a.length;i++) {
			b[i] = a[i];
		}
		
		for(String b1 : b) {
			
			System.out.print(b1+" ");
		}

	}

}

package com.array_poc;

//Add corresponding elements of two arrays and store the result in a third array.
public class MixTwoArraysSum {

	public static void main(String[] args) {
		short[] a = {10,20,30,40,50};
		short[] b = {1,5,7,8};
		short maxLength;
		
		if(a.length > b.length) {
			maxLength = (short)a.length;
		}else {
			maxLength = (short)b.length;
		}
		System.out.println("Max Length : "+maxLength);
		
		
		short[] c = new short[maxLength];
		
		
		for(short i=0;i<maxLength;i++) {
			
			short A = 0;
			short B = 0;
			
			if(i <a.length) {
				A = a[i];
			}
			
			if(i <b.length) {
				B = b[i];
			}
			c[i] = (short)(A + B);	
		}
		
		System.out.print("Maxture of Two Array Sum : ");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}

}

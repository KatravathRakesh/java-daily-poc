package com.array_poc;

//Print odd elements.
public class OddElements {

	public static void main(String[] args) {
        int[] a = {2,34,7,91,22,77,10};
		int count = 0;
		
		System.out.print("Odd Elements : ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2 != 0) {
				System.out.print(a[i]+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Count of Odd Number : "+count);

	}

}

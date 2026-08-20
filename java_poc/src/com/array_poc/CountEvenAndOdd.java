package com.array_poc;

public class CountEvenAndOdd {

	static void countEvenAndOdd(int[] num) {
		int Evencount = 0;
		int Oddcount = 0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]%2 == 0) {
				Evencount++;
			}else {
				Oddcount++;
			}
		}
		
		System.out.println("Even Count in Given Array : "+Evencount);
		System.out.println("Odd Count in Given Array : "+Oddcount);
	}
	public static void main(String[] args) {
		int[] num = {10,30,28,2,1,3,79};
		
		countEvenAndOdd(num);

	}

}

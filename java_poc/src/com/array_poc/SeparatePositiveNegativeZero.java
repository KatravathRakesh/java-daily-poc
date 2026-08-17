package com.array_poc;

import java.util.Arrays;

//Input:
//{1, -2, 0, 5, -7, 0, 3}
//
//You need to produce:
//
//Positive → 1, 5, 3
//Negative → -2, -7
//Zero → 0, 0
//Positive count → 3
//Negative count → 2
//Zero count → 2

public class SeparatePositiveNegativeZero {

	static void separateNumbers(int[] num) {
		int nCount = 0;
		int zCount = 0;
		int pCount = 0;
	
		
		System.out.print("Negative Number : ");
		for(int i=0;i<num.length;i++) {
			if(num[i] < 0) {
				nCount++;
				System.out.print(num[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Negative Count : "+nCount);
		
		System.out.print("Zero Number : ");
		for(int i=0;i<num.length;i++) {
			if(num[i] == 0) {
				zCount++;
				System.out.print(num[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Zero Count : "+zCount);
		
		System.out.print("Positive Number : ");
		for(int i=0;i<num.length;i++) {
			if(num[i] > 0) {
				pCount++;
				System.out.print(num[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Positive Count : "+pCount);
	}

	public static void main(String[] args) {
		int[] num = {-5, 0, 8, -2, 4, 0, -1};
		
		System.out.println(Arrays.toString(num));
		
		System.out.println("--------------------------");
		separateNumbers(num);

	}

}

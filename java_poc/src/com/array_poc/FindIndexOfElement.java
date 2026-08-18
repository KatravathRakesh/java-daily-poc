package com.array_poc;

import java.util.Scanner;

public class FindIndexOfElement {

	static void findindex(int[] num , int target) {
		int index = -2;
		
		for(int i=0;i<num.length;i++) {
			if(num[i] == target) {
				index = i;
			}
		}
		
		if(index >=0) {
			System.out.println("Index of Target Element in given array : "+index);
		}else {
			System.out.println("Index of Target Element in given array not found ");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num= {20,40,10,70,50};
		System.out.print("Enter the Target Element to find Index : ");
		int target = s.nextInt();
		
		findindex(num,target);
		s.close();
		
	}

}

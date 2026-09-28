package com.array_poc.two_d_Arrays;

import java.util.Arrays;

public class InclusionExclusion {

	static void printInclusion(int[][] arr) {
		
		int[] incl = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i != j) {
					if(arr[j][0] <= arr[i][0] && arr[i][1] <= arr[j][1]) {
						incl[i] = 1;
						break;
					}
				}else {
					incl[i] = 0;
				}
			}
		}
		
		System.out.println("Inclusion : "+Arrays.toString(incl));
//		for(int i : incl) {
//			System.out.print(i+" ");
//		}
		
		
		
	}
	
	public static void printExclusion(int[][] arr) {
		
		int[] excl = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i != j) {
					if(arr[j][0] <= arr[i][0] && arr[i][1] <= arr[j][1]) {
						excl[i-1] =1;
						break;
					}
				}else {
					excl[i] =0;
				}
			}
		}
		
		System.out.println("Exclusion : "+Arrays.toString(excl));
	}
	public static void main(String[] args) {
		int[][] arr = {{1,2},{2,10},{3,9},{5,8}};
		
		printInclusion(arr);
		printExclusion(arr);

	}

}

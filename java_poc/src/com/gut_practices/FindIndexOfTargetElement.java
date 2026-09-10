package com.gut_practices;

import java.util.Scanner;

public class FindIndexOfTargetElement {

	static int findIndex(int[] arr,int target) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = {10, 20, 30, 40, 50, 60};
		System.out.println("Enter the target Element : ");
		int target = s.nextInt();
		
		int index = findIndex(arr,target);
		System.out.println("Target Element "+target+" Index : "+index);
		
		s.close();
		

	}

}

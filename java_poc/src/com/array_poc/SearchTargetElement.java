package com.array_poc;

import java.util.Arrays;
import java.util.Scanner;

public class SearchTargetElement {

	static boolean search(int[] num, int target) {
		boolean flag = false;
		
		for(int i =0;i<num.length;i++) {
			if(num[i] == target) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		int[] num = {10,20,30,40,50,60};
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Target Element to Search : ");
		int target = s.nextInt();
		
		System.out.println(Arrays.toString(num));
		System.out.println();
		if(search(num,target)) {
			System.out.println("Target Element is Found in given list : "+target);
		}else {
			System.out.println("Target Element is not Found in given list : "+target);
		}

		s.close();
	}

}

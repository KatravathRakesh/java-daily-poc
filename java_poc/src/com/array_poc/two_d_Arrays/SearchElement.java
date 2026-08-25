package com.array_poc.two_d_Arrays;

import java.util.Scanner;

public class SearchElement {

	static boolean searchElement(int[][] num,int target) {
		boolean flag = false;
		
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				if(target == num[i][j]) {
					flag = true;
					break;
				}
			}
		}
		
		return flag;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] num = { { 10, 20, 30 },
				        { 40, 50, 60 }, 
				        { 70, 80, 90 } };
		
		System.out.print("Enter the Target : ");
		int target = s.nextInt();
		
		for(int n2[] : num) {
			for(int n1 : n2) {
				System.out.print(n1+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		if(searchElement(num,target)) {
			System.out.println("Given Arrays Element is Found : "+target);
		}else {
			System.out.println("Given Arrays Element is not Found : "+target);
		}
		
		s.close();
	}

}

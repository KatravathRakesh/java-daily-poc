package com.array_poc.two_d_Arrays;

import java.util.Scanner;

//1 2 3
//4 5 6
//
//Output:
//
//6
public class CountNumberOfElement {

	static int countElement(int[][] num) {
		
		int count = 0;
		for(int n1[] : num) {
			for(int n2 : n1) {
				count++;
			}
		}
		return count;
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] num = new int[2][3];
		
		System.out.println("Enter the Elements : ");
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				num[i][j] = s.nextInt();
			}
			System.out.println();
		}
		System.out.println();
		
		for(int n1[] : num) {
			for(int n2 : n1) {
				System.out.print(n2+" ");
			}
			System.out.println();
		}
		int count = countElement(num);
		System.out.println("Number of Element in Given Arrays : "+count);
		
		s.close();

	}

}

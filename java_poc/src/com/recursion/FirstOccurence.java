package com.recursion;

import java.util.Scanner;

public class FirstOccurence {

	static int firstOccu(int[] num , int key, int i) {
		if(i == num.length-1) {
			return -1;
		}
		
		if(num[i] == key) {
			return i;
		}
		
		return firstOccu(num,key,i+1);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = {10,2,3,8,7,9,5,3,1};
		System.out.println("Enter which element index do you want to find : ");
		int key = s.nextInt();
		int fO = firstOccu(num,key,0);
		System.out.println("First Occurences Element "+key+" index is : "+fO);

		s.close();
	}

}

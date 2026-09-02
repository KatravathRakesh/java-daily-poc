package com.recursion;

import java.util.Scanner;

public class LastOccurence {

	public static int lastOccu(int[] num,int key , int i) {
//		base case 
		if(i == num.length-1) {
			return -1;
		}
		
		int isFound = lastOccu(num,key,i+1);
		if(isFound == -1 && num[i] == key) {
			return i;
		}
		
		return isFound;
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] num = {10,2,3,8,7,3,5,8,1};
		System.out.println("Enter which element index do you want to find : ");
		int key = s.nextInt();
		int lO = lastOccu(num,key,0);
		System.out.println("First Occurences Element "+key+" index is : "+lO);

		s.close();

	}

}

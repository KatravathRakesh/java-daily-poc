package com.array_poc;

import java.util.Arrays;
import java.util.Scanner;

public class RotateRight {

	public static void rotateRightArray(int[] arr, int r) {
		int start = 0;
		int end = arr.length-1;
		r = r%arr.length;
		
		reverseArray(arr,start,end);
		reverseArray(arr,start,r-1);
		reverseArray(arr,r,end);
		
		System.out.println("Array rotate : "+Arrays.toString(arr));
		
	}
	
	public static void reverseArray(int[] arr,int start,int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many time you want to rotate : ");
		int r = s.nextInt();
		
		rotateRightArray(arr,r);

	}

}

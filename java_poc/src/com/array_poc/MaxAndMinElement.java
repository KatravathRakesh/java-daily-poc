package com.array_poc;

//Find the largest element
//Find the smallest element
public class MaxAndMinElement {

	public static void main(String[] args) {
int[][] arr = new int[3][3];
		
		arr[0][0] = 12;
		arr[0][1] = 21;
		arr[0][2] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 90;
		arr[1][2] = 0;
		
		arr[2][0] = 7;
		arr[2][1] = 83;
		arr[2][2] = 9;
		
		int min = arr[0][0];
		int max = arr[0][0];
		
		for(int arr1[] : arr) {
			for(int a : arr1) {
				
				System.out.print(a+" ");
				if(a < min) {
					min = a;
				}else if(a > max) {
					max =a;
				}
			}
			System.out.println();
		}
		
		System.out.println("Minimum Element : "+min);
		System.out.println("Maximum Element : "+max);

	}

}

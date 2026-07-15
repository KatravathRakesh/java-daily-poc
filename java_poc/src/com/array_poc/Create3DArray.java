package com.array_poc;

//Create and print a 3D array
public class Create3DArray {

	public static void main(String[] args) {
		int[][][] arr= new int[2][2][2];
		
		arr[0][0][0] = 1;
		arr[0][1][1] = 2;
		
		arr[1][0][0] = 4;
		arr[1][1][1] = 6;
		
		for(int arr2[][] : arr) {
			for(int arr1[] : arr2) {
				for(int a: arr1) {
					System.out.print(a+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}

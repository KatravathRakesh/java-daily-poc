package com.array_poc;


//Count even numbers
public class CountEvenandOddNumbers {

	public static void main(String[] args) {
		int[][] arr =new int[3][3];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 50;
		arr[1][2] = 6;

		arr[2][0] = 74;
		arr[2][1] = 8;
		arr[2][2] = 9;
		
		int evencount =0;
		int oddcount =0;
		for(int arr1[] : arr) {
			for(int a : arr1) {
				System.out.print(a+" ");
				if(a%2 == 0) {
					evencount++;
				}else {
					oddcount++;
				}
			}
			System.out.println();
		}
		
		System.out.println("Count even numbers : "+evencount);
		System.out.println("Count Odd numbers : "+oddcount);

	}

}

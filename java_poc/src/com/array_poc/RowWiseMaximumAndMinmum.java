package com.array_poc;

//Find the maximum and minimum in each row
public class RowWiseMaximumAndMinmum {

	public static void main(String[] args) {
		int col =3;
		int[][] arr = new int[3][col];

		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		
		for(int arr1[] : arr) {
			for(int a: arr1) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		
		
		
		for(int i=0;i<arr.length;i++) {
			int min = arr[i][0];
			int max = arr[0][0];
			for(int j=0;j<arr[i].length;j++) {
				if(min > arr[i][j]) {
					min = arr[i][j];
				}else if(max < arr[i][j]) {
					max = arr[i][j];
				}
				
			}
			System.out.println("Maximum in each row "+(i+1)+" : "+max);
			System.out.println("Minimum in each row :"+(i+1)+" : "+min);
			
		}

	}

}

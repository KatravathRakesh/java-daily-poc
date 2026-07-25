package com.pattern_poc;

import java.util.Scanner;

//Print HollowHourGlass
//*****
//*   *
// * *
//  *
// * *
//*   *
//*****
public class HollowHourGlass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of line you want print : ");
		int n = s.nextInt();

		for (int i = 0; i <= n - 1; i++) {
			if(i ==0 || i== n-1) {
				for(int j=0;j<n;j++) {
					System.out.print("*");
				}
			}else {
				for(int j=0;j<n;j++) {
					if(i==j || j == n-1-i) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

	}

}

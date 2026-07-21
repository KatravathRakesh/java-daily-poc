package com.pattern_poc;

import java.util.Scanner;

//print ZigZag Pattern
//*   *   *  0 1 2 3 4 5 6 7 8 9
// * * * *    1   4   4     9
//  *   *       1        4
// * * * *
//*   *   *
public class ZigZagPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the how many col you want :");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2*n; j++) {

				if (i == j || j == n - 1 - i || j== n-1+i  || j==2*n-2-i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}

}

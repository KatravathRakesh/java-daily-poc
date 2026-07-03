package com.for_loop_poc;

import java.util.Scanner;

//Print the cubes of numbers from 1 to N.
public class CubeNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Num : ");
		int n = s.nextInt();
		int cube =0;
		for(int i=1;i<=n;i++) {
			cube = i*(i*i);
		}
		System.out.println("Cube -> "+n+" = "+cube);
	}

}

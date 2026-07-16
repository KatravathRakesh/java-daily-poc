package com.pattern_poc;

import java.util.Scanner;

//print Arrow Pattern
//*
//**
//***
//****
//***
//**
//*
public class ArrowPattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number col want to print : ");
		int n = s.nextInt();
		
		for(int i=1; i<=n;i++) {
			//print Top star
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1; i<=n-1;i++) {
			//print Top star
			for(int j=n-1;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

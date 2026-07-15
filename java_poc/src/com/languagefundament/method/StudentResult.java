package com.languagefundament.method;

import java.util.Scanner;

public class StudentResult {

	static void SName(String name) {
		System.out.println("Student Name : "+name);
	}
	static void Totalmarks(int m1,int m2,int m3) {
		int sum = m1+m2+m3;
		System.out.println("Total marks : "+sum);
		Avgmarks(sum);
	}
	static void Avgmarks(int sum) {
		int avg = sum/3;
		System.out.println("Average marks : "+avg);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Student Name : ");
		String name = s.nextLine();
		System.out.print("Enter m1 marks :");
		int m1 = s.nextInt();
		System.out.print("Enter m2 marks :");
		int m2 = s.nextInt();
		System.out.print("Enter m3 marks :");
		int m3 = s.nextInt();
		
		SName(name);
		Totalmarks(m1,m2,m3);
		
		

	}

}

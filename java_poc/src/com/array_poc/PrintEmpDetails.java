package com.array_poc;

import java.util.Scanner;

public class PrintEmpDetails {

	static Scanner s = new Scanner(System.in);
	
	static void printEmpDetails(int size) {
		String[][] emp = new String [size][4];
		
		emp[0][0] = "EmpID | ";
		emp[0][1] = "EName | ";
		emp[0][2] = "Dept  | ";
		emp[0][3] = "Salary | ";
		System.out.println("Enter the Employee Details : ");
		for(int i=1;i<emp.length;i++) {
			for(int j=0;j<emp[i].length;j++) {
				emp[i][j] = s.next();
			}
			System.out.println();
		}
		
		
		
		for(String[] e1: emp) {
			for(String e : e1) {
				System.out.print(e+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the size : ");
		int size = s.nextInt();
		
		printEmpDetails(size); 
	}

}

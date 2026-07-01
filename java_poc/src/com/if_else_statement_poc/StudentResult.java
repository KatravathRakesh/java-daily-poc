package com.if_else_statement_poc;

import java.util.*;
//Print Pass or Fail based on marks.
public class StudentResult {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Mark : ");
		int mark = s.nextInt();
		
		if(mark >= 35) {
			System.out.println(mark+" : Pass");
		}else {
			System.out.println(mark+" : Fail");
		}

	}

}

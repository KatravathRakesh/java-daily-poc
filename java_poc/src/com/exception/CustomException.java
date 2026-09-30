package com.exception;

import java.util.*;

public class CustomException {

	public static void main(String[] args) throws ShfiException  {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age : ");
		int age = s.nextInt();
		if(age>18) {
			System.out.println("Voting");
		}else {
			throw new ShfiException();
		}

	}

}

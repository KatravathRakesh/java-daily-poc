package com.if_statement_poc;

import java.util.*;

//Print "Hot" if the temperature is greater than 35°C.
public class TemperatureCheck {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the temperature : ");
		int temp = s.nextInt();
		
		if(temp > 35) {
			System.out.println("Hot => "+temp+"°C");
		}
		
	}

}

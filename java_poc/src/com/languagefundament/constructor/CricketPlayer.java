package com.languagefundament.constructor;

import java.util.Scanner;

public class CricketPlayer {

	String name;
	long match;
	long runs;
	CricketPlayer(String name, long match, long runs) {
		System.out.println("parameter Constructor called");
		this.name = name;
		this.match = match;
		this.runs = runs;

	}

	static double calculate(long runs, long match) {
		double Avg = runs / match;
		return (double) Avg;
	}

	void show() {
		System.out.println("Player Name : "+name);
		System.out.println("Player Total Runs : "+runs);
		System.out.println("Player All Matches Played : "+match);
		
		System.out.println("Player Average Runs : "+calculate(runs,match));
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Player Name : ");
		String name = s.nextLine();
		System.out.print("Enter the Player Runs : ");
		long runs = s.nextLong();
		System.out.print("Enter the Player match : ");
		long match = s.nextLong();
		
		CricketPlayer c1 = new CricketPlayer(name,match,runs);
		c1.show();

		

	}

}

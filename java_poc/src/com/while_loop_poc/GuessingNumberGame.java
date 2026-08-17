package com.while_loop_poc;

import java.util.Scanner;

public class GuessingNumberGame {
	static Scanner s = new Scanner(System.in);

	static boolean isguessingNum(int chances) {
		boolean flag = false;
		int rdmNum = (int)(Math.random()*10+1);
		do {
			System.out.println("Enter the guessing Number : ");
			int n = s.nextInt();
			if(n == rdmNum) {
				flag = true;
				break;
			}else {
				chances--;
				if(chances > 0) {
					System.out.println("You guessed Wrong Number !");
					System.out.println("You have remaining Chances "+chances);
					System.out.println("--------------------------------------");
				}
			}
		}while(chances > 0);
		if(!flag) {
			System.out.println("Random Number : "+rdmNum);
		}
		
		return flag;
	}

	public static void main(String[] args) {
		System.out.println("Enter how many attempt want to give : ");
		int chances = s.nextInt();

		if (isguessingNum(chances)) {
			System.out.println("Congratulations ! You Guessed Correct Number and You Won!.");
		} else {
			System.out.println("Oops Sorry ! You Guessed wrong Number and chances limit completed and Better luck Next time !.");
		}

	}

}

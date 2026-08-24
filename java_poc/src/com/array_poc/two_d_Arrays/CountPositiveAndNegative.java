package com.array_poc.two_d_Arrays;

//Count positive, negative and zero

//{{-1,0},{2,-3}}

public class CountPositiveAndNegative {

	static void countPositiveAndNegative(int[][] num) {
		int Pcount = 0;
		int Ncount = 0;

		for (int n1[] : num) {
			for (int n2 : n1) {
				if(n2 >= 0) {
					Pcount++;
				}else if(n2 < 0) {
					Ncount++;
				}
			}
		}
		
		System.out.println("Positvie Count in Give Arrays : "+Pcount);
		System.out.println("Negatvie Count in Give Arrays : "+Ncount);

	}

	public static void main(String[] args) {
		int[][] num = { { -1, 0 }, { 2, 3 } };

		for (int n1[] : num) {
			for (int n2 : n1) {
				System.out.print(n2 + " ");
			}
			System.out.println();
		}
		System.out.println();

		countPositiveAndNegative(num);
	}

}

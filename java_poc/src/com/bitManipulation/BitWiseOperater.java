package com.bitManipulation;

public class BitWiseOperater {

	public static void main(String[] args) {
//		   256 128 64 32 16 8 4 2 1

		System.out.println(5 & 6);// 101 &110 => 100=>4
		System.out.println(5 | 6);// 101 |110 => 111 => 7
		System.out.println(5 ^ 6);// 101 ^110 => 011 => 3
		System.out.println(~5);// ~ => -(1+5) => -6
		/// 110 -> 11000 => 24 --> 6 is Number that coveted into bytes and 2 -s means
		/// move two steps towards left side.
		System.out.println(6 << 2);
		/// 111 -> 001 => 1 --> 7 is Number that coveted into bytes and 2 -s means
		/// move two steps towards right side.
		System.out.println(7 >> 2);

		System.out.println(6&1); // 110 & 001 => 0
	}

}

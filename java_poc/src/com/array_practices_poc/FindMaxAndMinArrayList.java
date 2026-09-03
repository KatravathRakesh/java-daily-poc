package com.array_practices_poc;

import java.util.ArrayList;

public class FindMaxAndMinArrayList {

	public static int findMax(ArrayList<Integer> list) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}

		return max;
	}

	public static int findMin(ArrayList<Integer> list) {
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < list.size(); i++) {
			if (min > list.get(i)) {
				min = list.get(i);
			}
		}

		return min;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(2);
		list.add(90);
		list.add(50);
		list.add(30);
		System.out.println("List of ArrayList : " + list);

		int max = findMax(list);
		System.out.println("Maximum Element : " + max);
		int min = findMin(list);
		System.out.println("Minimum Element : " + min);

	}

}

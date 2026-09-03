package com.array_practices_poc;

import java.util.ArrayList;

public class SwapElementInArrayList {

	public static void swapElement(ArrayList<Integer> list) {
		int temp = 0;
		int start = 0;
		int end = list.size()-1;
		while(start < end ) {
			temp = list.get(start);
			list.set(start, list.get(end));
			list.set(end, temp);
			start++;
			end--;
		}
		
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("List Of ArrayList :"+list);
		swapElement(list);
		System.out.println("List Of ArrayList :"+list);

	}

}

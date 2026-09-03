package com.array_practices_poc;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(9);
		list.add(3);
		list.add(10);
		list.add(2);
		list.add(4);
		
		System.out.println("List Of ArrayList Before Sort : "+list);
		Collections.sort(list);
		System.out.println("List Of ArrayList After Sort : "+list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("List Of ArrayList Reverse Order : "+list);
		

	}

}

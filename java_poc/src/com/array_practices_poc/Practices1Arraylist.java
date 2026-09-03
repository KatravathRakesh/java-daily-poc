package com.array_practices_poc;

import java.util.ArrayList;

public class Practices1Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
//		to add 
		System.out.println("Befor adding Array list : "+list);
		System.out.println("Size of ArrayList : "+list.size());
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println("After adding Array list : "+list);
		System.out.println("Size of ArrayList : "+list.size());
		System.out.println("Get Element from ArrayList : "+list.get(2));//get(index no)
		System.out.println("Remove Element : "+list.remove(3));//remove(index no)
		System.out.println("After adding Array list : "+list);
		System.out.println("Size of ArrayList : "+list.size());
		System.out.println("Set Element :"+list.set(3, 73));//set(index,value) replace value
		System.out.println("After adding Array list : "+list);
		System.out.println("Size of ArrayList : "+list.size());
		System.out.println("Check : "+list.contains(30));
		System.out.println();
	}

}

package com.collection;

import java.util.Hashtable;
import java.util.Map;

public class TestHashtable {
	public static void main(String[] args) {

//		Constructs a new, empty hashtable with a default initial capacity (11) 
//		and load factor (0.75).
		Map<Integer, String> map = new Hashtable<>();

		map.put(1, "Rohit");
		map.put(2, "Virat");
		map.put(3, "Dhoni");

		System.out.println(map);
	}
}

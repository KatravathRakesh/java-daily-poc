package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupOfAnagrams {

	public static void main(String[] args) {
		String[] angr = {"eat","tea","tan","ate","nat","bat"};
		
		HashMap<String, ArrayList<String>> map = new HashMap<>();
		
		for(int i=0;i<angr.length;i++) {
			
			char[] ch = angr[i].toCharArray();
			
			Arrays.sort(ch);
			String key = new String(ch);
			
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			
			map.get(key).add(angr[i]);
		}
		
		System.out.println(map.values());

	}

}

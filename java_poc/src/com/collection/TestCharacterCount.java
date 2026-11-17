package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TestCharacterCount {

    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String name = sc.nextLine();

        char[] ch = name.toCharArray();

        for (char c : ch) {

            if (map.containsKey(c)) {

                map.put(c, map.get(c) + 1);

            } else {

                map.put(c, 1);

            }
        }

        System.out.println(map);

        Set<Map.Entry<Character, Integer>> entries = map.entrySet();

        for (Map.Entry<Character, Integer> entry : entries) {

            System.out.println(entry.getKey() + " - " + entry.getValue());

        }

        sc.close();
    }
}
package com.collection;

import java.util.IdentityHashMap;
import java.util.Map;

public class TestIdentityHashMap {

    public static void main(String[] args) {

        Map<String, String> names = new IdentityHashMap<>();

//        String s1 = "Java";
//        String s2 = "Java";

//        String Object 
        String s1 = new String("Java");
        String s2 = new String("Java");
        
        names.put(s1, "Java is Difficult in other coaching ");
        names.put(s2, "Java is Simple");

        System.out.println(names);
    }
}
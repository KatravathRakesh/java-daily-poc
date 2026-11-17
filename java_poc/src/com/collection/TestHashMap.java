package com.collection;


import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("TS", "Telangana");
        map.put("AP", "Andhra Pradesh");
        map.put("KA", "Karnataka");
        map.put("TN", "Tamil Nadu");
        map.put("KL", "Kerala");

        System.out.println(map);

        System.out.println(map.containsKey("KA"));
        System.out.println(map.containsValue("Kerala"));
    }
}

package com.DSA_JAVA.MAP;

import java.util.*;

public class Example8 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(101, "Alice");
        map1.put(102, "Bob");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(103, "Charlie");
        map2.put(104, "David");

        map1.putAll(map2);
        System.out.println("After merging map2 into map1: " + map1);
    }
}

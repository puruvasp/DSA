package com.DSA_JAVA.MAP;

import java.util.*;

public class Example6 {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");

        System.out.println("All keys in the Map:");
        for (Integer key : studentMap.keySet()) {
            System.out.println(key);
        }
    }
}

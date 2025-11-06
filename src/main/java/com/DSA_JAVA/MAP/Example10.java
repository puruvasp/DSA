package com.DSA_JAVA.MAP;

import java.util.*;

public class Example10 {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");

        List<Integer> keysList = new ArrayList<>(studentMap.keySet());
        List<String> valuesList = new ArrayList<>(studentMap.values());

        System.out.println("List of Keys: " + keysList);
        System.out.println("List of Values: " + valuesList);
    }
}

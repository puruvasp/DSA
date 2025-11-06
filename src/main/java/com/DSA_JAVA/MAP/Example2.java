package com.DSA_JAVA.MAP;

import java.util.*;

public class Example2 {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");

        int searchKey = 102;
        if (studentMap.containsKey(searchKey)) {
            System.out.println("Key " + searchKey + " exists in the Map.");
        } else {
            System.out.println("Key " + searchKey + " does not exist in the Map.");
        }
    }
}

package com.DSA_JAVA.MAP;

import java.util.*;

public class Example5 {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");

        int removeKey = 102;
        studentMap.remove(removeKey);

        System.out.println("After removing roll no " + removeKey + ": " + studentMap);
    }
}

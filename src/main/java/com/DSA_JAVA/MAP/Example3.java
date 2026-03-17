package com.DSA_JAVA.MAP;

import java.util.*;

public class Example3 {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");

        String searchValue = "Alice";
        if (studentMap.containsValue(searchValue)) {
            System.out.println("Value '" + searchValue + "' exists in the Map.");
        } else {
            System.out.println("Value '" + searchValue + "' does not exist in the Map.");
        }
    }
}

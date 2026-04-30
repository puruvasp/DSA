package com.DSA_JAVA.MAP;

import java.util.*;

public class Example9 {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");

        studentMap.replace(102, "Bobby");

        System.out.println("After replacing value for key 102: " + studentMap);
    }
}

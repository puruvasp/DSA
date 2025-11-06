package com.DSA_JAVA.SET;

import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(10, 20, 20, 30, 40, 40);
        System.out.println("Original List (with duplicates): " + numberList);

        Set<Integer> numberSet = new HashSet<>(numberList);
        System.out.println("Converted Set (unique elements only): " + numberSet);
    }
}

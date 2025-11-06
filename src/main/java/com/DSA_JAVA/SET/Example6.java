package com.DSA_JAVA.SET;

import java.util.*;

public class Example6 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));

        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        System.out.println("Union of two Sets: " + unionSet);
    }
}

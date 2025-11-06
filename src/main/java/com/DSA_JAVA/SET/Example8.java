package com.DSA_JAVA.SET;

import java.util.*;

public class Example8 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7));

        Set<Integer> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);

        System.out.println("Difference (set1 - set2): " + differenceSet);
    }
}

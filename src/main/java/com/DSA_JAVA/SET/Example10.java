package com.DSA_JAVA.SET;

import java.util.*;

public class Example10 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(10, 20, 30, 40));

        System.out.println("Iterating through Set using Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

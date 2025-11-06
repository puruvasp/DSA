package com.DSA_JAVA.SET;

import java.util.*;

public class Example3 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);

        int searchElement = 10;
        if (numbers.contains(searchElement)) {
            System.out.println("Element " + searchElement + " exists in the Set.");
        } else {
            System.out.println("Element " + searchElement + " does not exist in the Set.");
        }
    }
}

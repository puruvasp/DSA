package com.DSA_JAVA.SET;

import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Unique numbers in the Set: " + numbers);
    }
}

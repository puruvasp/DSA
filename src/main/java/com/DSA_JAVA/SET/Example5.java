package com.DSA_JAVA.SET;

import java.util.*;

public class Example5 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        System.out.println("Before removing: " + fruits);

        fruits.remove("Banana");

        System.out.println("After removing 'Banana': " + fruits);
    }
}

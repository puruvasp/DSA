package com.DSA_JAVA.SET;

import java.util.*;

public class Example9 {
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        String[] colorArray = colors.toArray(new String[0]);

        System.out.println("Array elements:");
        for (String color : colorArray) {
            System.out.println(color);
        }
    }
}

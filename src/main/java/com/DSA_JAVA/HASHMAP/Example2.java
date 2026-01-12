package com.DSA_JAVA.HASHMAP;

import java.util.HashMap;

public class Example2 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 2};

        HashMap<Integer, Integer> map = new HashMap<>();
        boolean hasDuplicate = false;

        for (int num : arr) {
            if (map.containsKey(num)) {
                hasDuplicate = true;
                break;
            }
            map.put(num, 1);
        }
        System.out.println(hasDuplicate);
    }
}

package com.DSA_JAVA.ARRAY;

public class Example2 {
    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 3, 40, 15, 30};

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
        }

        System.out.println("Second Largest Element: " + secondLargest);
    }
}

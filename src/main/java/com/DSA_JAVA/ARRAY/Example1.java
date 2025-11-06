package com.DSA_JAVA.ARRAY;

public class Example1 {
    public static void main(String[] args){

        int[] arr = {10, 25, 7, 3, 40, 15};

        int largest = arr[0];

            for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > largest)
                    {
                        largest = arr[i];
                    }
            }
            System.out.println("Largest Element: " + largest);
    }
}
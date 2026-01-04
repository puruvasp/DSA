package com.DSA_JAVA.ARRAY;

public class Example9 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                }
            }
        }
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < n; i++) {
            if (arr[i] != -1) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

package com.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Maximum in an array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // Create and populate the array
        Scanner input = new Scanner(System.in);
        int[] arr = new int[20];

        for (int i = 0; i < 20; i++) {
            arr[i] = input.nextInt();
        }

        return arr;
    }

    public static int max(int[] array) {
        // Find the maximum
        int maximum = array[0];

        for (int value : array) {
            if (value > maximum)
                maximum = value;
        }
        return maximum;
    }
}

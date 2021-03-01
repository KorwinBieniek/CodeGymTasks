package com.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];

        int maximum;
        int minimum;

        //write your code here

        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        maximum = array[0];
        minimum = array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i] > maximum)
                maximum = array[i];
            if(array[i] < minimum)
                minimum = array[i];
        }

        System.out.print(maximum + " " + minimum);
    }
}

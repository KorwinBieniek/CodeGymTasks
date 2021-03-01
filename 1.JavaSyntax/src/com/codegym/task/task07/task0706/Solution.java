package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        Scanner input = new Scanner(System.in);
        int[] array = new int[15];

        int even = 0, odd = 0;

        for (int i = 0; i < 15; i++) {
            array[i] = input.nextInt();
            if(i % 2 != 0)
                odd+=array[i];
            else
                even+=array[i];
        }
        if(odd > even)
            System.out.println("Odd-numbered houses have more residents.");
        else
            System.out.println("Even-numbered houses have more residents.");
    }
}

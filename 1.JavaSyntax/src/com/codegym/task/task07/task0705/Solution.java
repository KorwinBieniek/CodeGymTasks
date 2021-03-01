package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] arr1 = new int[20];

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            arr1[i] = input.nextInt();
        }

        int[] half1 = new int[10];
        int[] half2 = new int[10];

        for (int i = 0; i < 10; i++) {
            half1[i] = arr1[i];
            half2[i] = arr1[i+10];
            System.out.println(half2[i]);
        }
    }
}

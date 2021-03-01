package com.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
String array in reverse order

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str_list = new String[10];

        for (int i = 0; i < 8; i++) {
            str_list[i] = br.readLine();
        }

        for (int i = str_list.length-1; i >= 0; i--) {
            System.out.println(str_list[i]);
        }
    }
}
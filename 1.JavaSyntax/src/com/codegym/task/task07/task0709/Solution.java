package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner sc1 = new Scanner(System.in);
        ArrayList<String>array = new ArrayList<>();
        for(int x = 0; x<5; x++) {
            String s = sc1.nextLine();
            array.add(s);
        }
        int min = Integer.MAX_VALUE;
        for(String s : array) {
            if (s.length() < min)
            min = s.length();
        }
        for(String s : array) {
            if (s.length() == min){
                System.out.println(s);
            }
        }
    }
}

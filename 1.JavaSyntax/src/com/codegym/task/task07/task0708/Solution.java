package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input = new Scanner(System.in);
        strings = new ArrayList<>();
        int max_length = 0;

        for (int i = 0; i < 5; i++) {
            strings.add(input.next());
            if(strings.get(i).length() > max_length)
                max_length = strings.get(i).length();
        }

        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length() == max_length)
                System.out.println(strings.get(i));
        }
    }
}

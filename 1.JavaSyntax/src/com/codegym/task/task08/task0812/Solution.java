package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Longest sequence

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(br.readLine()));
            /*list.add(89);
            list.add(12);
            list.add(12);
            list.add(98);
            list.add(111);
            list.add(42);
            list.add(98);
            list.add(98);
            list.add(98);
            list.add(71);*/
        }

        int[] longest = new int[10];
        int x = 0;

        for (int i = 1; i < list.size(); i++) {
            if(list.get(i - 1).equals(list.get(i)))
                longest[x]++;
            else
                x++;
        }

        int max = longest[0];
        for (int i = 0; i < longest.length; i++) {
            if(longest[i] > max)
                max = longest[i];
        }

        System.out.println(max+1);

    }
}
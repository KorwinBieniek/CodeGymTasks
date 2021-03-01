package com.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Checking the order

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());
        }

        for (int i = 1; i < list.size(); i++) {
            if(list.get(i).length() < list.get(i-1).length())
            {
                System.out.println(i);
                break;
            }
        }
    }
}


package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int n = 0;
        int m = 0;

        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());
        }
        int max = list.get(0).length();
        int min = max;

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() > max)
                max = list.get(i).length();
            if(list.get(i).length() < min)
                min = list.get(i).length();
        }

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() ==  max)
            {
                n = i;
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() ==  min)
            {
                m = i;
                break;
            }
        }
        if(n > m)
            System.out.println(list.get(m));
        else
            System.out.println(list.get(n));
    }
}

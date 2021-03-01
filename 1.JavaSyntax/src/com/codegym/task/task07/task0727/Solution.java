package com.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Changing functionality

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> lists = new ArrayList<String>();
        lists = list;
        for (int i = 0; i < lists.size(); i++) {
            String s = lists.get(i);
            if(lists.get(i).length() % 2 == 0)
            {
                s = s + " " + s;
                list.set(i, s);
            }

            else
            {
                s = s + " " + s + " " + s;
                list.set(i, s);
            }
        }

        for (String s : lists) {
            System.out.println(s);
        }
    }
}

package com.codegym.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Month number

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        ArrayList<String> monthList = new ArrayList<String>();

        monthList.add("January");
        monthList.add("February");
        monthList.add("March");
        monthList.add("April");
        monthList.add("May");
        monthList.add("June");
        monthList.add("July");
        monthList.add("August");
        monthList.add("September");
        monthList.add("October");
        monthList.add("November");
        monthList.add("December");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine().toUpperCase();

        for (int i = 0;i < monthList.size();i++){
            if (s.equals(monthList.get(i).toUpperCase())){
                System.out.println(monthList.get(i) + " is month "+ (i+1));
            }
        }
    }
}

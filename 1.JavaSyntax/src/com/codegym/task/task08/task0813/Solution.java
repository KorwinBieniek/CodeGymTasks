package com.codegym.task.task08.task0813;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

/* 
20 words that start with the letter "L"

*/

public class Solution {
    public static Set<String> createSet() {
        //write your code here
        Set<String> set = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            set.add("Lego" + i);
        }



        return set;

    }

    public static void main(String[] args) {
        Set<String> set = createSet();

    }

}

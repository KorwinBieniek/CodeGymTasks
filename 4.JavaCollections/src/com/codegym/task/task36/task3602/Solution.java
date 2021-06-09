package com.codegym.task.task36.task3602;

import java.util.Collections;

/* 
Find the class by its description

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getExpectedClass());
    }

    public static Class getExpectedClass() {
        for (Class clazz : Collections.class.getDeclaredClasses()) {
            if (clazz.getSimpleName().equals("EmptyList")) {
                return clazz;
            }
        }
        return null;
    }
}

package com.codegym.task.task09.task0906;

/* 
Logging stack traces

*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //write your code here
        StackTraceElement[] element = Thread.currentThread().getStackTrace();
        System.out.println( element[2].getClassName() + ": " + element[2].getMethodName() + ": " + s);
    }
}

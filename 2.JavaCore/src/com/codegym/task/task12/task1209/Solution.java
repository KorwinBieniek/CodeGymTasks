package com.codegym.task.task12.task1209;

/* 
Three methods and a minimum

*/

public class Solution {
    public static void main(String[] args) {

    }

    //write your code here

    public static int min(int x, int y){
        return x > y ? y : x;
    }

    public static long min(long x, long y){
        return x > y ? y : x;
    }

    public static double min(double x, double y){
        return Math.min(x, y);
    }
}

package com.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/* 
Request parser

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Scanner input = new Scanner(System.in);
        String URL = input.next();
        String[] split1 = URL.split("\\?");
        String[] split2 = split1[1].split("=");
        String[] split3 = split2[1].split("&");


        if(!URL.contains("obj")) {
            System.out.print(split2[0] + " ");
            read(split3);
        } else {
            System.out.print(split2[0] + " ");
            read(split3);
            System.out.println("\n");
            try {
                alert(Double.parseDouble(split3[0]));
            } catch (NumberFormatException e) {
                alert(split3[0]);
            }

        }
        //http://codegym.cc/alpha/index.html?obj=fds&name=Amigo



    }

    public static void read(String[] split) {
        for (int i = 1; i < split.length; i++) {
            System.out.print(split[i] + " ");
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}

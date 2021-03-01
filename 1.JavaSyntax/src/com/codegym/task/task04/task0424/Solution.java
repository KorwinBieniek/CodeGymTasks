package com.codegym.task.task04.task0424;

/* 
Three numbers

*/

import java.io.*;
import java.util.Scanner;

import static java.lang.System.exit;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a!=b&&a!=c&&b!=c)
        {}
        else if(a != b && a != c)
            System.out.println(1);
        else if(b != a)
            System.out.println(2);
        else if(c != a)
            System.out.println(3);

    }
}

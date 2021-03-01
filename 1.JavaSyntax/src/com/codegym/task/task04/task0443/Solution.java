package com.codegym.task.task04.task0443;


/* 
A name is a name

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input = new Scanner(System.in);

        String name = input.next();

        int year = input.nextInt(), month = input.nextInt(), day = input.nextInt();

        System.out.println("My name is " + name+".");
        System.out.println("I was born on " + month+"/"+day+"/"+year);
    }
}

package com.codegym.task.task04.task0423;

/* 
Bouncer policy

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input = new Scanner(System.in);

        String name = input.next();

        int age = input.nextInt();

        if(age > 20)
            System.out.println("18 is old enough");
    }
}

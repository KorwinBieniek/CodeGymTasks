package com.codegym.task.task04.task0426;

/* 
Labels and numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        if(a < 0 && a % 2 == 0)
            System.out.println("Negative even number");
        else if(a < 0 && a % 2 != 0)
            System.out.println("Negative odd number");
        else if(a > 0 && a % 2 == 0)
            System.out.println("Positive even number");
        else if(a > 0 && a % 2 != 0)
            System.out.println("Positive odd number");
        else
            System.out.println("Zero");
    }
}

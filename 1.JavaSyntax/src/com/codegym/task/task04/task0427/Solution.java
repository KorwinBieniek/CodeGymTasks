package com.codegym.task.task04.task0427;

/* 
Describing numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        if(a < 10 && a >= 1 && a % 2 == 0)
            System.out.println("even single-digit number");
        else if(a < 10 && a >= 1 && a % 2 != 0)
            System.out.println("odd single-digit number");
        else if(a < 100 && a >= 10 && a % 2 == 0)
            System.out.println("even two-digit number");
        else if(a < 100 && a >= 10 && a % 2 != 0)
            System.out.println("odd two-digit number");
        else if(a < 1000 && a >= 100 && a % 2 == 0)
            System.out.println("even three-digit number");
        else if(a < 1000 && a >= 100 && a % 2 != 0)
            System.out.println("odd three-digit number");
    }
}

package com.codegym.task.task04.task0441;


/* 
Somehow average

*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if(a == b && a == c)

            System.out.println(a);
        else if(a == b || a == c)
            System.out.println(a);
        else if(b == c)
            System.out.println(b);
        else
        {
            if(a > b && b >= c)
                System.out.println(b);
            else if(b > a && a >= c)
                System.out.println(a);
            else if(b >= c)
                System.out.println(c);
            else if(b >= a)
                System.out.println(b);
            else if(c >= a)
                System.out.println(a);
            else System.out.println(c);
        }


    }
}

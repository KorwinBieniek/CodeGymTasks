package com.codegym.task.task04.task0428;

/* 
Positive number

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());


        if(a > 0)
        {
            if(b > 0)
            {
                if(c > 0)
                    System.out.println(3);
                else
                    System.out.println(2);
            }
            else
                if(c > 0)
                    System.out.println(2);
                else
                    System.out.println(1);
        }
        else
        if(b > 0)
        {
            if(c > 0)
                System.out.println(2);
            else
                System.out.println(1);
        }
        else
        if(c > 0)
            System.out.println(1);
        else
            System.out.println(0);

    }
}

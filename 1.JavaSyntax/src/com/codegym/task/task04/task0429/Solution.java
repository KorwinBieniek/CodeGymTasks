package com.codegym.task.task04.task0429;

/* 
Positive and negative numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int pos = 0;
        int neg = 0;

        if(a > 0)
        {
            pos++;
            if(b > 0)
            {
                pos++;
                if(c > 0)
                {
                    pos++;
                }
                else if ( c < 0)
                    neg++;
            }
            else if (b < 0)
            {
                neg++;
                if(c > 0)
                {
                    pos++;
                }
                else if ( c < 0)
                    neg++;
            }
            else if(c > 0)
            {
                pos++;
            }
            else if ( c < 0)
                neg++;
        }
        else if(a < 0)
        {
            neg++;
            if(b > 0)
            {
                pos++;
                if(c > 0)
                {
                    pos++;
                }
                else if ( c < 0)
                    neg++;
            }
            else if (b < 0)
            {
                neg++;
                if(c > 0)
                {
                    pos++;
                }
                else if ( c < 0)
                    neg++;
            }
            else if(c > 0)
            {
                pos++;
            }
            else if ( c < 0)
                neg++;
        }
        else {
            if (b > 0) {
                pos++;
                if (c > 0) {
                    pos++;
                } else if (c < 0)
                    neg++;
            } else if (b < 0) {
                neg++;
                if (c > 0) {
                    pos++;
                } else if (c < 0)
                    neg++;
            } else if (c > 0) {
                pos++;
            } else if (c < 0)
                neg++;
        }

        System.out.println("Number of negative numbers: " + neg);
        System.out.println("Number of positive numbers: " + pos);

    }
}

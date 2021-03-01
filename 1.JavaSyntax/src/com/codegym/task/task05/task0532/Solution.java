package com.codegym.task.task05.task0532;

import java.io.*;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum = Integer.MIN_VALUE;

        //write your code here
        if(n>0) {

            for (int i = 0; i < n; i++) {

                int num = Integer.parseInt(reader.readLine());

                    if (num > maximum)
                        maximum = num;
            }


            System.out.println(maximum);
        }

    }
}

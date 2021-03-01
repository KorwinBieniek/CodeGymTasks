package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0, count = 0;

        while (true) {
            int number = Integer.parseInt(br.readLine());
            if (number == -1)
            break;
            else
            {
                sum += number;
                count++;
            }
        }

        System.out.println((double)sum/count);

    }
}


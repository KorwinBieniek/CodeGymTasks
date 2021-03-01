package com.codegym.task.task04.task0433;


/* 
Seeing dollars in your future

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int i =0;

        while(i<10)
        {
            int j = 0;
            while(j < 10)
            {
                System.out.print('$');
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

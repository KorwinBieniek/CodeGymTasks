package com.codegym.task.task04.task0425;

/* 
Target locked!

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        if(x > 0 && y > 0)
            System.out.println(1);
        else if(x > 0 && y < 0)
            System.out.println(4);
        else if(x < 0 && y > 0)
            System.out.println(2);
        else if(x < 0 && y < 0)
            System.out.println(3);
    }
}

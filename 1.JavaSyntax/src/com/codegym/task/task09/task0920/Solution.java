package com.codegym.task.task09.task0920;

/* 
Countdown

*/

public class Solution {
    public static void main(String[] args) {
        try {

            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
                Thread.sleep(100);
                //write your code here
            }
        }
        catch(java.lang.InterruptedException e)
            {

            }
        }
}

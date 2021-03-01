package com.codegym.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Mastering the static block

*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //write your code here
        reset();
    }

    public static CanFly result;

    public static void reset() {
        //write your code here
        Scanner input = new Scanner(System.in);

        String machine = input.next();

        if(machine.equals("helicopter")) {
            result = new Helicopter();
        }
        else if (machine.equals("plane")) {
            int passengers = input.nextInt();

            result = new Plane(passengers);
        }

        input.close();
    }
}

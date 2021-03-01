package com.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

/* 
Different methods for different types

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        Scanner input = new Scanner(System.in);
        String choice;

        while (!(choice = input.next()).equals("exit")) {
            try {

                if (choice.contains(".")) {
                    print(Double.parseDouble(choice));
                } else if (Integer.parseInt(choice) > 0 && Integer.parseInt(choice) < 128) {
                    print(Short.parseShort(choice));
                } else if (Integer.parseInt(choice) <= 0 || Integer.parseInt(choice) >= 128) {
                    print(Integer.parseInt(choice));
                }
            } catch (Exception e) {
                print("1");
            }
        }
    }

    public static void print(Double value) {
        System.out.println("This is a Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("This is a String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("This is a short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("This is an Integer. Value: " + value);
    }
}

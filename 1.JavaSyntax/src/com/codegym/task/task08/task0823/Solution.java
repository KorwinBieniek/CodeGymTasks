package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Going national

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        // LowerCase everything
        s = s.toLowerCase();
        // convert String into a char[] array
        char[] charString = s.toCharArray();
        // variable for a space
        char space = ' ';
        //loop through char[] array
        for (int i = 0; i < charString.length; i++) {
            // continue loop if charString[i] is a space
            if (charString[i] == space) {
                continue;
                // check if string is index[0] (and not a space)
            } else if (charString[i] == charString[0]
                    // or  if index before is a space AND index is not a space
                    || (charString[i - 1] == space && charString[i] != space)) {
                // ASCII table conversion to get an uppercase from a lowercase
                //charString[i] -= 32;
                charString[i]= Character.toUpperCase(charString[i]);
            }
        }
        // convert char[] array back to String
        String b = new String(charString);
        // print String
        System.out.print(b);
    }
}

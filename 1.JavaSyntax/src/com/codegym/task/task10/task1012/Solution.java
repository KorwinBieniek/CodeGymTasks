package com.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Number of letters

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        // write your code here
        int[] abcCounter = new int[abcArray.length];

        for (String s : list) {
            char[] stringToChar = s.toCharArray();
            for (int j = 0; j < stringToChar.length; j++) {
                for (int k = 0; k < abcArray.length; k++) {
                    if (stringToChar[j] == abcArray[k])
                        abcCounter[k]++;
                }
            }

        }

        for (int i = 0; i < abcArray.length; i++) {
            System.out.println(abcArray[i] + " " + abcCounter[i]);
        }
    }
}

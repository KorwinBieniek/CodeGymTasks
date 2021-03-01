package com.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/* 
Vowels and consonants

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Character> vowels = new LinkedList<>();
        List<Character> consonants = new LinkedList<>();

        String str = br.readLine();

        str = str.replaceAll(" ","");

        for (int i = 0; i < str.length(); i++) {
            if(isVowel(str.charAt(i)))
                vowels.add(str.charAt(i));
            else
                consonants.add(str.charAt(i));
        }

        for (Character vowel : vowels) {
            System.out.print(vowel + " ");
        }
        System.out.println();
        for (Character consonant : consonants) {
            System.out.print(consonant + " ");
        }
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
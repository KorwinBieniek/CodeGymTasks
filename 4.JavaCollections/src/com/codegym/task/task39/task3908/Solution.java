package com.codegym.task.task39.task3908;

/* 
Is a palindrome possible?

*/

public class Solution {
    public static void main(String[] args) {

    }

    public static boolean isPalindromePermutation(String s) {
        boolean foundOdd = false;
        int[] tableCount = new int[256];

        for(char c : s.toLowerCase().toCharArray()) {
            tableCount[c] += 1;
        }

        for(int count : tableCount) {
            if (count % 2 != 0) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }

        return true;
    }
}

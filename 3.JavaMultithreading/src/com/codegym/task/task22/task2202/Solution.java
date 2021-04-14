package com.codegym.task.task22.task2202;

/* 
Find a substring

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("CodeGym is the best place to learn Java."));
    }

    public static String getPartOfString(String string) {
        if (string == null) {
            throw new StringTooShortException();
        }
        String[] splitWithSpaces = string.split(" ");

        if(splitWithSpaces.length < 5) throw new StringTooShortException();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < 5; i++) {
            stringBuilder.append(splitWithSpaces[i]);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }

    public static class StringTooShortException extends RuntimeException {
    }
}

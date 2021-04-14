package com.codegym.task.task22.task2203;

/* 
Between tabs

*/

public class Solution {
    public static void main(String[] args) throws Exception{
        System.out.println(getPartOfString("\tCodeGym is the best place \tto learn Java\t."));
    }

    public static String getPartOfString(String string) throws StringTooShortException {
        if (string == null) {
            throw new StringTooShortException();
        }
        String[] splitWithTabs = string.split("\\t");

        if(splitWithTabs.length < 3) throw new StringTooShortException();

        return splitWithTabs[1];
    }

    public static class StringTooShortException extends Exception {
    }
}

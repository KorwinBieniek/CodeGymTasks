package com.codegym.task.task10.task1015;

import java.util.ArrayList;

/* 
Array of string lists

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //write your code here
        ArrayList<String>[] listOfStringArrays = (ArrayList<String>[]) new ArrayList[3];

        listOfStringArrays[0] = new ArrayList<>();
        listOfStringArrays[1] = new ArrayList<>();
        listOfStringArrays[2] = new ArrayList<>();

        listOfStringArrays[0].add("dog");
        listOfStringArrays[0].add("dog");
        listOfStringArrays[1].add("zzz");
        listOfStringArrays[1].add("xxx");
        listOfStringArrays[1].add("dgg");
        listOfStringArrays[1].add("dfd");
        listOfStringArrays[1].add("cat");
        listOfStringArrays[2].add("dog");

        return listOfStringArrays;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
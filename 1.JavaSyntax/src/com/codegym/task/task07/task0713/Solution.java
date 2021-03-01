package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        ArrayList<Integer> array3 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            array.add(input.nextInt());
            if(array.get(i) % 3 == 0)
            {
                array1.add(array.get(i));
                if(array.get(i) % 2 == 0)
                    array2.add(array.get(i));
            }

            else if(array.get(i) % 2 == 0)
                array2.add(array.get(i));
            else
                array3.add(array.get(i));
        }

        printList(array1);
        printList(array2);
        printList(array3);
    }

    public static void printList(List<Integer> list) {
        //write your code here
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

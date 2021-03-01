package com.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/* 
Method in a try-catch

*/

public class Solution {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> list = new ArrayList<>();
        int choice = 0;
        try
        {
            do
            {
                choice = input.nextInt();
                list.add(choice);
            }while(choice > 0);



        }
        catch(InputMismatchException e)
        {
        }
        finally
        {
            for (Integer integer : list) {
                System.out.println(integer);
            }
        }

        //write your code here
    }
}

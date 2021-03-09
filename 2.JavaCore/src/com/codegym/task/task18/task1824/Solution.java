package com.codegym.task.task18.task1824;

/* 
Files and exceptions

*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);


        while (true) {
            String filename = sc.next();
            try (FileInputStream fileInputStream = new FileInputStream(filename)) {

            } catch (FileNotFoundException e) {
                System.out.println(filename);
                break;
            }
        }
    }
}

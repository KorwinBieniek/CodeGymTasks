package com.codegym.task.task18.task1818;

/* 
Two in one

*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String filename1 = sc.next();
        String filename2 = sc.next();
        String filename3 = sc.next();

        try(FileOutputStream fileOutputStream = new FileOutputStream(filename1);
        FileInputStream fileInputStream1 = new FileInputStream(filename2);
        FileInputStream fileInputStream2 = new FileInputStream(filename3)) {
            while(fileInputStream1.available() > 0) {
                fileOutputStream.write(fileInputStream1.read());
            }

            while(fileInputStream2.available() > 0) {
                fileOutputStream.write(fileInputStream2.read());
            }
        }


    }
}

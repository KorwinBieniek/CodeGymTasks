package com.codegym.task.task18.task1819;

/* 
Combining files

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String filename1 = sc.next();
        String filename2 = sc.next();

        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             FileInputStream fileInputStream1 = new FileInputStream(filename2);
             FileInputStream fileInputStream2 = new FileInputStream(filename1)) {

            while (fileInputStream1.available() > 0) {
                byteArrayOutputStream.write(fileInputStream1.read());
            }

            while (fileInputStream2.available() > 0) {
                byteArrayOutputStream.write(fileInputStream2.read());
            }

            try (FileOutputStream fileOutputStream = new FileOutputStream(filename1)) {
                byteArrayOutputStream.writeTo(fileOutputStream);
            }
        }
    }
}

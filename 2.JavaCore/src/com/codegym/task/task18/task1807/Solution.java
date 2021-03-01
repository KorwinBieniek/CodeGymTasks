package com.codegym.task.task18.task1807;

/* 
Counting commas

*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner fileNameScanner = new Scanner(System.in);

        String fileName = fileNameScanner.next();

        int commaCount = 0;
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                if (fileInputStream.read() == 44) commaCount++;
            }
        }

        System.out.println(commaCount);
    }
}

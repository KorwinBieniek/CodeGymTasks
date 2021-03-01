package com.codegym.task.task18.task1808;

/* 
Splitting a file

*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner fileNameScanner = new Scanner(System.in);

        String inputFile = fileNameScanner.next();
        String firstOutputFile = fileNameScanner.next();
        String secondOutputFile = fileNameScanner.next();

        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             FileOutputStream firstFileOutputStream = new FileOutputStream(firstOutputFile);
             FileOutputStream secondFileOutputStream = new FileOutputStream(secondOutputFile)) {

            List<Integer> bytesList = new ArrayList<>();
            int availableBytes = fileInputStream.available();
            int numberOfByte = 0;

            while(fileInputStream.available() > 0) {
                if(numberOfByte < (availableBytes + 1)/2) {
                    firstFileOutputStream.write(fileInputStream.read());
                    numberOfByte++;
                }

                else secondFileOutputStream.write(fileInputStream.read());
            }


        }
    }
}

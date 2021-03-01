package com.codegym.task.task18.task1801;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Maximum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner fileNameInputScanner = new Scanner(System.in);


        FileInputStream findMaximumByteFile = new FileInputStream(fileNameInputScanner.next());

        long sum = 0;
        int maxByte = 0;


        while (findMaximumByteFile.available() > 0) {
            int checkByte = findMaximumByteFile.read();
            if (maxByte < checkByte) {
                maxByte = checkByte;
            }
        }

        findMaximumByteFile.close();

        System.out.println(maxByte);
    }
}

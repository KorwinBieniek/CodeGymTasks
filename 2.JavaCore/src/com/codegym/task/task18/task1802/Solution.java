package com.codegym.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Minimum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader filenameReader = new BufferedReader(new InputStreamReader(System.in));
        String minimumByteFilename = filenameReader.readLine();

        FileInputStream findMinimumByteStream = new FileInputStream(minimumByteFilename);
        int minByte = 255;

        while (findMinimumByteStream.available() > 0) {
            int compareByte = findMinimumByteStream.read();
            if (minByte > compareByte) {
                minByte = compareByte;
            }
        }
        findMinimumByteStream.close();

        System.out.println(minByte);
    }
}

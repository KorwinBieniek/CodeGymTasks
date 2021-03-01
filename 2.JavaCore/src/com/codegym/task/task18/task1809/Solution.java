package com.codegym.task.task18.task1809;

/* 
Reversing a file

*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
        String outputFile = fileNameScanner.next();

        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {

            List<Integer> byteList = new ArrayList<>();

            while(fileInputStream.available() > 0) {
                byteList.add(fileInputStream.read());
            }

            Collections.reverse(byteList);
            for (Integer integer : byteList) {
                fileOutputStream.write(integer);
            }
        }


    }
}

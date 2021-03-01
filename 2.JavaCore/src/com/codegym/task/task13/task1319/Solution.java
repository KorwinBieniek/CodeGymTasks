package com.codegym.task.task13.task1319;

import java.io.*;

/* 
Writing to a file from the console

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();
        String line;

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

        do{
            line = reader.readLine();
            writer.write(line + "\n");

        }while(!line.equals("exit"));

        writer.close();

    }
}

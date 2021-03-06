package com.codegym.task.task18.task1817;

/* 
Spaces

*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        int numberOfSpaces = 0;
        int numberOfCharacters = 0;
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                char readChar = (char) fileReader.read();
                if (readChar == ' ') numberOfSpaces++;
                numberOfCharacters++;
            }
            double characterToSpacesRation = (double) numberOfSpaces/numberOfCharacters*100;
            System.out.printf("%.2f",characterToSpacesRation);
        }
    }
}

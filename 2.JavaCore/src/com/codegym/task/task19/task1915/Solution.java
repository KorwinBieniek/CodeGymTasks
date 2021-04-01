package com.codegym.task.task19.task1915;

import java.io.*;

/* 
Duplicate text

*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        PrintStream realStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        PrintStream myStream = new PrintStream(byteArrayOutputStream);
        System.setOut(myStream);

        testString.printSomething();

        FileOutputStream fileInputStream = new FileOutputStream(fileName);
        fileInputStream.write(byteArrayOutputStream.toByteArray());
        fileInputStream.close();

        System.setOut(realStream);
        System.out.println(byteArrayOutputStream.toString());

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This is text for testing");
        }
    }
}


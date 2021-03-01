package com.codegym.task.task16.task1621;

/* 
Thread.currentThread always returns the current thread

*/

public class Solution {
    static int count = 5;

    public static void main(String[] args) throws InterruptedException {
        ThreadNamePrinter tnp = new ThreadNamePrinter();
        tnp.start();
        for (int i = 0; i < count; i++) {
            tnp.printMsg();
        }
    }

    public static class ThreadNamePrinter extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                try {
                    printMsg();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void printMsg() throws InterruptedException {
            Thread t = Thread.currentThread(); // The current thread should be assigned to the variable t
            String name = t.getName();
            System.out.println("Name = " + name);
            // Add sleep here
            Thread.sleep(1);
        }
    }
}

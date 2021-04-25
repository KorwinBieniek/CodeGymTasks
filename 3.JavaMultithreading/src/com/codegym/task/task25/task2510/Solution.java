package com.codegym.task.task25.task2510;

/* 
Wait and see

*/

public class Solution extends Thread {

    public Solution() {
        this.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                String message;
                if (e instanceof Error) message = "Can't keep running";
                else if (e instanceof Exception) message = "Needs handling";
                else message = "Wait and see";
                System.out.println(message);
            }
        });
    }

    public static void main(String[] args) {
    }
}

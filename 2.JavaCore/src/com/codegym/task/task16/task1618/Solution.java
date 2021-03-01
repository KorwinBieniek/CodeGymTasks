package com.codegym.task.task16.task1618;

/* 
Another interruption

*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //write your code here
        TestThread tt = new TestThread();
        tt.start();
        tt.interrupt();
    }

    //write your code here
    public static class TestThread extends Thread{
        @Override
        public void run() {
            super.run();
        }
    }
}
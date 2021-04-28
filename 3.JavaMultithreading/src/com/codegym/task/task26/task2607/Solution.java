package com.codegym.task.task26.task2607;

/* 
Politeness is an artificial good mood

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class IntegerHolder {
        private int value;

        public synchronized int get() {
            return value;
        }

        public synchronized void set(int value) {
            this.value = value;
        }
    }
}

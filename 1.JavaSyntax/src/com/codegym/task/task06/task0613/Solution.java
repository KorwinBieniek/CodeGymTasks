package com.codegym.task.task06.task0613;

/* 
Cat and statics

*/

public class Solution {
    public static void main(String[] args) {
        // Create 10 cats
        for (int i = 0; i < 10; i++) {
            new Cat();
        }
        System.out.println(Cat.catCount);

        // Display the value of the variable catCount
    }

    public static class Cat {
        // Create a static variable catCount
        static public int catCount = 0;

        // Declare a constructor

        public Cat() {
            catCount++;
        }
    }
}

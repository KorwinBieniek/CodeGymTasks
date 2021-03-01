package com.codegym.task.task15.task1502;

/* 
OOP: Animal inheritance

*/

public class Solution {
    // Add the Goose and Dragon classes here
    public static class Goose extends SmallAnimal {
        public String getSize() {
            return "A goose is small, " + super.getSize();
        }
    }

    public static class Dragon extends BigAnimal {
        public String getSize() {
            return "A dragon is big, " + super.getSize();
        }
    }

    public static void main(String[] args) {
        Goose goose = new Goose();
        Dragon dragon = new Dragon();

        System.out.println(goose.getSize());

        System.out.println(dragon.getSize());
    }

    public static class BigAnimal {
        protected String getSize() {
            return "like a dinosaur";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "like a cat";
        }
    }
}

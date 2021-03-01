package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Write your variables and constructors here
        private String firstName;
        private String lastName;
        private String pesel;
        private int weight;
        private int height;
        private int age;

        public Human(String firstName, String lastName, String pesel, int weight, int height, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.pesel = pesel;
            this.weight = weight;
            this.height = height;
            this.age = age;
        }

        public Human(String firstName, String lastName, int height) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.height = height;
        }

        public Human(String firstName, int weight, int height) {
            this.firstName = firstName;
            this.weight = weight;
            this.height = height;
        }

        public Human(String firstName, int weight) {
            this.firstName = firstName;
            this.weight = weight;
        }

        public Human(String firstName, String lastName, String pesel) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.pesel = pesel;
        }

        public Human(int weight, int height, int age) {
            this.weight = weight;
            this.height = height;
            this.age = age;
        }

        public Human(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        public Human(int weight) {
            this.weight = weight;
        }

        public Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(String firstName) {
            this.firstName = firstName;
        }
    }
}

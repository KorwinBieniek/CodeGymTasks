package com.codegym.task.task05.task0526;

/* 
Man and woman

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Man man = new Man("Korwin", 21, "Gliwice");
        Man man1 = new Man("Korwin", 21, "Gliwice");
        Woman woman = new Woman("Julia", 21, "Gliwice");
        Woman woman1 = new Woman("Julia", 21, "Gliwice");
        System.out.println(man);
        System.out.println(man1);
        System.out.println(woman);
        System.out.println(woman1);
    }

    //write your code here

    public static class Man
    {
        String name;
        int age;
        String address;

        public Man(int age) {
            this.age = age;
        }

        public Man() {
        }

        public Man(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Man(String name) {
            this.name = name;
        }

        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman
    {
        String name;
        int age;
        String address;

        public Woman(int age) {
            this.age = age;
        }

        public Woman() {
        }

        public Woman(String name, String address) {
            this.name = name;
            this.address = address;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Woman(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Woman(String name) {
            this.name = name;
        }

        public String toString()
        {
            return name + " " + age + " " + address;
        }
    }
}

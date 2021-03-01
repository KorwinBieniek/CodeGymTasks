package com.codegym.task.task05.task0517;

/* 
Creating cats

*/

public class Cat {
    //write your code here
    String name, color, address;
    int weight, age;

    public Cat(int weight,String color,String address) {
        this.color = color;
        this.address = address;
        this.weight = weight;
        age = 1;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "yellow";
    }

    public Cat(int weight, String color) {
        this.color = color;
        this.weight = weight;
        age = 5;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        color = "pink";
        weight = 5;
    }

    public Cat(String name) {
        this.name = name;
        color = "blue";
        weight = 5;
        age = 1;
    }

    public static void main(String[] args) {

    }
}

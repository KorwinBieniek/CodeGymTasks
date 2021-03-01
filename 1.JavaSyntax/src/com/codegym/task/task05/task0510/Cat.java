package com.codegym.task.task05.task0510;

/* 
Initializing cats

*/

public class Cat {
    //write your code here

    private String Name = null;
    private int weight;
    private int age;
    private String color;
    private String address = null;


    public void intialize(String name) {
        this.Name = name;
        weight = 5;
        age = 5;
        color = "Grey";

    }

    public void intialize(String name, int weight, int age) {
        this.Name = name;
        this.weight = weight;
        this.age = age;
        color = "white";
    }

    public void intialize(String name, int age) {
        this.Name = name;
        this.age = age;
        weight = 10;
        color = "Black";

    }

    public void intialize(int weight, String color) {

        this.weight = weight;
        this.color = color;
        age = 6;

    }

    public void intialize(int weight, String color, String address) {

        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 8;


    }
}

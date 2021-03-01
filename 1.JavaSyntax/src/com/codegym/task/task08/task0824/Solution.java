package com.codegym.task.task08.task0824;

/* 
Make a family

*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        ArrayList<Human> grandparentsA = new ArrayList<>();
        ArrayList<Human> grandparentsB = new ArrayList<>();
        ArrayList<Human> parents = new ArrayList<>();
        ArrayList<Human> children = new ArrayList<>();

        Human grandfatherA = new Human("John", true, 50, grandparentsA);
        Human grandmotherA = new Human("Jane", true, 50, grandparentsA);

        Human grandfatherB = new Human("John", true, 50, grandparentsB);
        Human grandmotherB = new Human("Jane", true, 50, grandparentsB);

        Human father =new Human("Jim", true, 50, parents);
        grandparentsA.add(father);

        Human mother = new Human("Mary",  true, 50, parents);
        grandparentsB.add(mother);

        Human sonA = new Human("Tim", true, 50, children);
        Human sonB = new Human("Tom", true, 50, children);
        Human sonC = new Human("Bob", true, 50, children);

        Collections.addAll(parents, sonA, sonB, sonC);

        System.out.println(grandfatherA);
        System.out.println(grandmotherA);
        System.out.println(grandfatherB);
        System.out.println(grandmotherB);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(sonA);
        System.out.println(sonB);
        System.out.println(sonC);
    }

    public static class Human {
        //write your code here
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}

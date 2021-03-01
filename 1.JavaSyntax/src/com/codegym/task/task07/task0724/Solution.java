package com.codegym.task.task07.task0724;

/* 
Family census

*/

public class Solution {
    public static void main(String[] args) {
        // write your code here
        Human grandpa1 = new Human("gradna",false,44);
        Human grandpa2 = new Human("graasdgs",false,44);
        Human grandma1 = new Human("dgdsgsdgad",false,44);
        Human grandma2 = new Human("dagdsgdssgd",true,44);

        Human mam = new Human("dad",false,44,grandpa1,grandma1);
        Human dad = new Human("mam",true,42,grandpa2,grandma2);
        Human kid1 = new Human("fgdsgds",true,10,dad,mam);
        Human kid2 = new Human("gdsgd",true,14,dad,mam);
        Human kid3 = new Human("fgdsgdsgsgds",false,12,dad,mam);

        System.out.println(grandpa1);
        System.out.println(grandpa2);
        System.out.println(grandma1);
        System.out.println(grandma2);
        System.out.println(dad);
        System.out.println(mam);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);
    }

    public static class Human {
        // write your code here
        String name;
        boolean sex;
        int age;
        Human father, mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
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

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}
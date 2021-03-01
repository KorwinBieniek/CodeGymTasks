package com.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Cat relations

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String grandpaname = reader.readLine();
        String granmaaname = reader.readLine();
        String fathername = reader.readLine();
        String mothername = reader.readLine();
        String sonname = reader.readLine();
        String daughtername = reader.readLine();

        Cat grandpa = new Cat(grandpaname);
        Cat grandma = new Cat(granmaaname);
        Cat father = new Cat(fathername,null, grandpa);
        Cat mother = new Cat(mothername, grandma, null);
        Cat son = new Cat(sonname, mother, father);
        Cat daughter = new Cat(daughtername,mother, father);

        System.out.println(grandpa);
        System.out.println(grandma);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        public Cat(Cat mother) {
            this.mother = mother;
        }

        @Override
        public String toString() {
            if (mother == null && father == null)
                return "The cat's name is " + name + ", no mother, no father ";
            else if(father == null)
                return "The cat's name is " + name + ", " + mother.name + " is the mother, no father";
            else if(mother == null)
                return "The cat's name is " + name + ", no mother, " + father.name + " is the father";
            else
                return "The cat's name is " + name + ", " + mother.name + " is the mother, " + father.name + " is the father";
        }
    }

}

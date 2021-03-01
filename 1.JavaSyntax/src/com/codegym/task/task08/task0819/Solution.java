package com.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set of cats

*/

public class Solution {
    public static class Cat{

        public static Cat cat1 = new Cat();
        public static Cat cat2 = new Cat();
        public static Cat cat3 = new Cat();

        public Cat(){}
    }
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //write your code here. step 3
        for(Cat cat : cats)
        {
            cats.remove(cat);
            break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //write your code here. step 2
        HashSet<Cat> set = new HashSet<>();

        set.add(Cat.cat1);
        set.add(Cat.cat2);
        set.add(Cat.cat3);
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4
        for(Cat cat : cats)
            System.out.println(cat);
    }

    // step 1
}

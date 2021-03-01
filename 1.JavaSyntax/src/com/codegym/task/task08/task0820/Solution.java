package com.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Animal set

*/

public class Solution {
    public static class Cat
    {
        static Cat cat1 = new Cat();
        static Cat cat2 = new Cat();
        static Cat cat3 = new Cat();
        static Cat cat4 = new Cat();
    }

    public static class Dog
    {
        static Dog dog1 = new Dog();
        static Dog dog2 = new Dog();
        static Dog dog3 = new Dog();

    }

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        //write your code here
        result.add(Cat.cat1);
        result.add(Cat.cat2);
        result.add(Cat.cat3);
        result.add(Cat.cat4);

        return result;
    }

    public static Set<Dog> createDogs() {
        //write your code here
        HashSet<Dog> result = new HashSet<Dog>();

        //write your code here
        result.add(Dog.dog1);
        result.add(Dog.dog2);
        result.add(Dog.dog3);


        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //write your code here
        HashSet<Object> animals = new HashSet<>();

        animals.addAll(cats);
        animals.addAll(dogs);

        return animals;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //write your code here
        for(Cat cat : cats)
            pets.remove(cat);
    }

    public static void printPets(Set<Object> pets) {
        //write your code here
        for(Object object : pets)
            System.out.println(object);
    }

    //write your code here
}

package com.codegym.task.task35.task3510;

import java.util.ArrayList;
import java.util.List;

/* 
Entry prohibited!

*/

public class House<T> {

    private List<T> residents = new ArrayList<T>();

    public void admit(T resident) {
        residents.add(resident);
    }

    public void expel(T resident) {
        residents.remove(resident);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("The house has the following residents:\n");
        for (T resident : residents) {
            builder.append(resident.toString()).append("\n");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        Dog bruno = new Dog("Bruno");
        Puppy cooper = new Puppy("Cooper");
        Cat smudge = new Cat("Smudge");
        Kitten molly = new Kitten("Molly");

        House<Dog> dogHouse = new House<>();
        dogHouse.admit(bruno);
        dogHouse.admit(cooper);
        System.out.println(dogHouse.toString());

        House<Cat> catHouse = new House<>();
        catHouse.admit(smudge);
        catHouse.admit(molly);
        System.out.println(catHouse.toString());
    }
}

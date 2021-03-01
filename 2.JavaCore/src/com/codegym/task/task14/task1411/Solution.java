package com.codegym.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
User, loser, coder and programmer

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        List<String> list = new ArrayList<>();
        do{
            key = reader.readLine();
            list.add(key);
        }while(key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("programmer"));
        // Here's the loop for reading the keys. Item 1
        for (int i = 0; i < list.size(); i++) {

            // Create an object. Item 2
            // Call doWork
            if ("user".equals(list.get(i))) {
                person = new Person.User();
                doWork(person);
            } else if ("loser".equals(list.get(i))) {
                person = new Person.Loser();
                doWork(person);
            } else if ("coder".equals(list.get(i))) {
                person = new Person.Coder();
                doWork(person);
            } else if ("programmer".equals(list.get(i))) {
                person = new Person.Programmer();
                doWork(person);
            }
        }
    }

    public static void doWork(Person person) {
        // Item 3
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Programmer) {
            ((Person.Programmer) person).enjoy();
        }
    }
}

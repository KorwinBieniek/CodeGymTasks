package com.codegym.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;

/* 
Currencies

*/

public class Solution {
    public static void main(String[] args) {
        Person paul = new Person("Paul");
        for (Money money : paul.getAllMoney()) {
            System.out.println(paul.name + " has a stash of " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    public static class Person {
        public String name;

        public Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            //write your code here

            allMoney.add(new Euro(2000));
            allMoney.add(new Ruble(3000));
            allMoney.add(new USD(4500));
        }

        private List<Money> allMoney;


        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}

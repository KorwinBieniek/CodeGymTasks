package com.codegym.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    static com.codegym.task.task21.task2113.Hippodrome game;
    private List<Horse> horses;

    void run() {
    }

    void move() {
    }

    void print() {
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) {
        game = new com.codegym.task.task21.task2113.Hippodrome(new ArrayList<>());
        game.getHorses().add(new Horse("Lucky", 3, 0));
        game.getHorses().add(new Horse("Slevin", 3, 0));
        game.getHorses().add(new Horse("Homer", 3, 0));
    }
}

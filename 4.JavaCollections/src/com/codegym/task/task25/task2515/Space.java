package com.codegym.task.task25.task2515;

import java.util.List;
import java.util.ArrayList;

public class Space {

    public static Space game;

    private int width;
    private int height;

    private Spaceship ship;
    private List<Ufo> ufos = new ArrayList<>();
    private List<Rocket> rockets = new ArrayList<>();
    private List<Bomb> bombs = new ArrayList<>();

    public Space(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void run() {
    }

    public void draw() {
    }

    public void sleep(int ms) {
    }

    public static void main(String... args) {
    }

    public void setShip(Spaceship ship) {
        this.ship = ship;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Spaceship getShip() {
        return ship;
    }

    public List<Ufo> getUfos() {
        return ufos;
    }

    public List<Rocket> getRockets() {
        return rockets;
    }

    public List<Bomb> getBombs() {
        return bombs;
    }
}

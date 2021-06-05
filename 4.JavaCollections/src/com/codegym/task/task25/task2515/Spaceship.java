package com.codegym.task.task25.task2515;

public class Spaceship extends BaseObject {

    private double dx;

    public Spaceship(double x, double y) {
        super(x, y, 3);
    }

    public void moveLeft() {
        dx = -1;
    }

    public void moveRight() {
        dx = 1;
    }
}

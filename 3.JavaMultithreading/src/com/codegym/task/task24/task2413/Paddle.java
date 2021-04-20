package com.codegym.task.task24.task2413;

public class Paddle extends BaseObject {
    // Speed
    private double speed;
    // Direction (-1: to the left, +1: to the right)
    private double direction;

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public Paddle(double x, double y) {
        super(x, y, 3);
        speed = 1;
        direction = 0;
    }

    @Override
    void draw(Canvas canvas) {

    }

    @Override
    void move() {
        double dx = speed * direction;
        x = x + dx;
    }

    /**
     * Set direction to -1
     */
    public void moveLeft() {
        direction = -1;
    }

    /**
     * Set direction to +1
     */
    public void moveRight() {
        direction = 1;
    }
}

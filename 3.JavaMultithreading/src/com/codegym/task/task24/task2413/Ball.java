package com.codegym.task.task24.task2413;

public class Ball extends BaseObject {

    // Speed
    private double speed;
    // Direction (0 to 360 degrees)
    private double direction;

    // Current direction vector (dx, dy)
    private double dx;
    private double dy;

    // Is the object frozen or movable?
    private boolean isFrozen;

    public Ball(double x, double y, double speed, double direction) {
        super(x, y, 1);

        this.direction = direction;
        this.speed = speed;

        this.isFrozen = true;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }

    @Override
    void draw(Canvas canvas) {

    }

    @Override
    void move() {

    }
}

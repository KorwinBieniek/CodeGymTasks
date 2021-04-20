package com.codegym.task.task24.task2413;

import java.util.ArrayList;
import java.util.List;

public class Arkanoid {
    private int width;
    private int height;
    public static Arkanoid game;
    private boolean isGameOver;

    private Ball ball;
    private Paddle paddle;
    private List<Brick> bricks;

    public Arkanoid(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public Paddle getPaddle() {
        return paddle;
    }

    public void setPaddle(Paddle paddle) {
        this.paddle = paddle;
    }

    public List<Brick> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick> bricks) {
        this.bricks = bricks;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    void run() {

    }

    void move() {
        ball.move();
        paddle.move();
    }

    void draw(Canvas canvas) {
        //draw bricks
        for (Brick brick : bricks) {
            brick.draw(canvas);
        }

        //draw ball
        ball.draw(canvas);

        //draw paddle
        paddle.draw(canvas);
    }

    public void checkPaddleCollision() {
        if (ball.intersects(paddle)) {
            double angle = 90 + 20 * (Math.random() - 0.5);
            ball.setDirection(angle);
        }
    }

    public void checkGameOver() {
        if (ball.getY() > height)
            isGameOver = true;
    }

    public void checkBrickCollision() {
        for (Brick brick : new ArrayList<>(bricks)) {
            if (ball.intersects(brick)) {
                double angle = Math.random() * 360;
                ball.setDirection(angle);

                bricks.remove(brick);
            }
        }
    }

    public static void main(String[] args) {

    }
}

package com.codegym.task.task23.task2312;

import java.awt.event.KeyEvent;

/**
 * The program's main class.
 */
public class Room {
    private int width;
    private int height;
    private Snake snake;
    private Mouse mouse;

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
    }

    public Snake getSnake() {
        return snake;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    /**
     * The program's main loop.
     * This is where all the important actions happen.
     */
    public void run() {
    }

    /**
     * Display the current game state on the screen
     */
    public void print() {
        // Create an array where we will "draw" the current game state
        // Draw all the parts of the snake
        // Draw the mouse
        // Display it all on the screen
    }

    /**
     * This method is called when the mouse is eaten
     */
    public void eatMouse() {
        createMouse();
    }

    /**
     * Create a new mouse
     */
    public void createMouse() {
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);

        mouse = new Mouse(x, y);
    }

    public static Room game;

    public static void main(String[] args) {
        game = new Room(20, 20, new Snake(10, 10));
        game.snake.setDirection(SnakeDirection.DOWN);
        game.createMouse();
        game.run();
    }

    /**
     * The programmer pauses. The length of the pause depends on the length of the snake.
     */
    public void sleep() {
    }
}

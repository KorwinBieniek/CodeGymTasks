package com.codegym.task.task34.task3410.controller;

import com.codegym.task.task34.task3410.model.Direction;

public interface EventListener {
    void move(Direction direction);
    void restart();
    void startNextLevel();
    void levelCompleted(int level);
}

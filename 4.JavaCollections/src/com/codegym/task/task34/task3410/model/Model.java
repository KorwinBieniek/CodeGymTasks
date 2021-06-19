package com.codegym.task.task34.task3410.model;

import com.codegym.task.task34.task3410.controller.EventListener;

public class Model {
    public static final int BOARD_CELL_SIZE = 20;

    private EventListener eventListener;

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }
}

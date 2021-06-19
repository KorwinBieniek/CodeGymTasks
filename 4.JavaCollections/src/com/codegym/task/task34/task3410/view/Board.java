package com.codegym.task.task34.task3410.view;

import com.codegym.task.task34.task3410.controller.EventListener;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    View view;
    private EventListener eventListener;

    public Board(View view) {
        this.view = view;
    }

    public void setEventListener(EventListener eventListener) {
        this.eventListener = eventListener;
    }

    @Override
    public void paint(Graphics g) {
    }
}

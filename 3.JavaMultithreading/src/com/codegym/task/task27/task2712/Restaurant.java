package com.codegym.task.task27.task2712;

import com.codegym.task.task27.task2712.kitchen.Cook;

public class Restaurant {
    public static void main(String[] args) {
        Tablet tablet = new Tablet(5);
        Cook cook = new Cook("Amigo");
        tablet.addObserver(cook);

        tablet.createOrder();
        tablet.createOrder();
        tablet.createOrder();
        tablet.createOrder();
    }
}
package com.codegym.task.task27.task2712.kitchen;

import com.codegym.task.task27.task2712.ConsoleHelper;
import com.codegym.task.task27.task2712.Tablet;

import java.io.IOException;
import java.util.List;

public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        this.dishes = ConsoleHelper.getAllDishesForOrder();
        ConsoleHelper.writeMessage(toString());
    }

    @Override
    public String toString() {
        String result = "";
        if (dishes.size() == 0) return result;
        result+="Your order: [" + dishes.get(0);

        for (int i = 1; i < dishes.size(); i++) {
            result += ", " + dishes.get(i).name();
        }
        result+="] from " + tablet;
        return result;
    }
}

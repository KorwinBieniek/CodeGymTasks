package com.codegym.task.task27.task2712;

import com.codegym.task.task27.task2712.kitchen.Cook;
import com.codegym.task.task27.task2712.kitchen.Order;
import com.codegym.task.task27.task2712.statistics.StatisticsManager;

import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

public class OrderManager implements Observer {
    private LinkedBlockingQueue<Order> orderQueue = new LinkedBlockingQueue(200);

    public OrderManager() {
        Thread thread = new Thread() {
            @Override
            public void run() {

                Set<Cook> cooks = StatisticsManager.getInstance().getCooks();
                try {
                    while (true) {
                        Thread.sleep(10);
                        if (!orderQueue.isEmpty()) {
                            for (Cook cook : cooks) {
                                if (!cook.isBusy()) {
                                    cook.startCookingOrder(orderQueue.take());
                                }
                            }
                        }
                    }
                } catch (InterruptedException e) {
                }

            }
        };
        thread.setDaemon(true);
        thread.start();
    }

    public void update(Observable tablet, Object arg) {
        Order order = (Order) arg;
        orderQueue.add(order);
    }
}

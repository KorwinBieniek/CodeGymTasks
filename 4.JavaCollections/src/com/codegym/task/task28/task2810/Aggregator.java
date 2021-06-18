package com.codegym.task.task28.task2810;

import com.codegym.task.task28.task2810.model.LinkedinStrategy;
import com.codegym.task.task28.task2810.model.Provider;

public class Aggregator {

    public static void main(String[] args) {
        Provider provider = new Provider(new LinkedinStrategy());
        Controller controller = new Controller(provider);
        controller.scan();
    }
}

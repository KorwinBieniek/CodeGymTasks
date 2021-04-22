package com.codegym.task.task24.task2407;

public class Mouse implements Pet, CanSpeak {
    @Override
    public CanSpeak toCanSpeak(int i) {
        return this;
    }

    @Override
    public String speak() {
        return "The mouse squeaks.";
    }
}

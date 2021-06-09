package com.codegym.task.task37.task3702;

import com.codegym.task.task37.task3702.female.FemaleFactory;
import com.codegym.task.task37.task3702.male.MaleFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(HumanFactoryType type) {
        if (type == HumanFactoryType.MALE) {
            return new MaleFactory();
        } else {
            return new FemaleFactory();
        }
    }

    public static enum HumanFactoryType {
        MALE,
        FEMALE
    }
}

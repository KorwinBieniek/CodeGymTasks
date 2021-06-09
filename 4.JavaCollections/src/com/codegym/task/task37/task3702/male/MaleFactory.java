package com.codegym.task.task37.task3702.male;

import com.codegym.task.task37.task3702.Human;

public class MaleFactory {

    public Human getPerson(int age) {
        Human human = null;
        if (age <= KidBoy.MAX_AGE) {
            human = new KidBoy();
        } else
            if (age <= TeenBoy.MAX_AGE) {
                human = new TeenBoy();
            } else
                human = new Man();
        return human;
    }
}

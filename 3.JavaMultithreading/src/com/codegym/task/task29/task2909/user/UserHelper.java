package com.codegym.task.task29.task2909.user;

import java.util.concurrent.atomic.AtomicInteger;

public class UserHelper {
    private User userAnna = new User("Anna", "Larsen", 10);
    private User userRoman = new User("Roman", "Crouch", 30);

    private boolean isAnnaMale = false;
    private boolean isRomanMale = true;

    public void printUsers() {
        userAnna.printInfo();
        userAnna.printAdditionalInfo();

        userRoman.printInfo();
        userRoman.printAdditionalInfo();
    }

    public int calculateAverageAge() {
        User userGeorge = new User("George", "Carp", 28);
        return (userAnna.getAge() + userRoman.getAge() + userGeorge.getAge()) / 3;
    }

    public int calculateRate(AtomicInteger base, int age, boolean hasJob, boolean hasHouse) {
        int result  = base.get() + age / 100;
        result *= hasJob ? 1.1 : 0.9;
        result *= hasHouse ? 1.1 : 0.9;
        return result;
    }

    public String getBossName(User user) {
        Job job = user.getJob();
        return job.getBoss();
    }
}
package com.codegym.task.task12.task1226;

/* 
Climb, fly, and run

*/

public class Solution {

    public static void main(String[] args) {

    }

    public class Cat implements CanClimb, CanRun{
        @Override
        public void run() {

        }

        @Override
        public void climb() {

        }
    }

    public class Dog implements CanRun{
        @Override
        public void run() {

        }
    }

    public class Tiger extends Cat{
    }

    public class Duck implements CanFly, CanRun{
        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }

    public interface CanFly{
        void fly();
    }

    public interface CanRun{
        void run();
    }

    public interface CanClimb{
        void climb();
    }
}

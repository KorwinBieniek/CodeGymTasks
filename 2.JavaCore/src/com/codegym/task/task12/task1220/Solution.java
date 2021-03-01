package com.codegym.task.task12.task1220;

/* 
Human class and CanRun and CanSwim interfaces

*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanRun{
        boolean isRunning();
    }

    public interface CanSwim{
        boolean isSwimming();
    }

    // Add public interfaces and a public class here
    public abstract class Human implements CanRun, CanSwim {

    }
}

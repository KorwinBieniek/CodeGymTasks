package com.codegym.task.task17.task1707;

public class IMF {

    private static IMF imf;

    public static IMF getFund() {
        //write your code here
        if (imf == null) {
            synchronized (IMF.class) {
                imf = new IMF();
                return imf;
            }
        }
        return imf;
    }

    private IMF() {
    }
}

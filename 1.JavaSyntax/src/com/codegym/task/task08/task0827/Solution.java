package com.codegym.task.task08.task0827;

import java.util.Calendar;
import java.util.Date;

/* 
Working with dates

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date date1= new Date(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        int day = cal.get(Calendar.DAY_OF_YEAR);
        if(day%2==1)
            return true;
        else
            return false;
    }
}

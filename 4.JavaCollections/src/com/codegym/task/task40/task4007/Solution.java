package com.codegym.task.task40.task4007;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* 
Working with Java 8's DateTime API

*/

public class Solution {
    public static void main(String[] args) {
        printDate("21.4.2014 15:56:45");
        System.out.println();
        printDate("21.4.2014");
        System.out.println();
        printDate("17:33:40");
    }

    public static void printDate(String date) {
        boolean printDate = true;
        boolean printTime = true;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        if (date.contains(".") && !date.contains(":")) {
            dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            printTime = false;
        }
        if (date.contains(":") && !date.contains(".")) {
            dateFormat = new SimpleDateFormat("HH:mm:ss");
            printDate = false;
        }

        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(dateFormat.parse(date));

            if (printDate) {
                System.out.println("Day: " + calendar.get(Calendar.DATE));
                System.out.println("Day of the week: " + (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY ? 7 : calendar.get(Calendar.DAY_OF_WEEK) - 1));
                System.out.println("Day of the month: " + calendar.get(Calendar.DAY_OF_MONTH));
                System.out.println("Day of the year: " + calendar.get(Calendar.DAY_OF_YEAR));
                System.out.println("Week of the month: " + calendar.get(Calendar.WEEK_OF_MONTH));
                System.out.println("Week of the year: " + calendar.get(Calendar.WEEK_OF_YEAR));
                System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1));
                System.out.println("Year: " + calendar.get(Calendar.YEAR));
            }
            if (printTime) {
                System.out.println("AM or PM: " + (calendar.get(Calendar.AM_PM) == Calendar.PM ? "PM" : "AM"));
                System.out.println("Hour: " + calendar.get(Calendar.HOUR));
                System.out.println("Hour of the day: " + calendar.get(Calendar.HOUR_OF_DAY));
                System.out.println("Minutes: " + calendar.get(Calendar.MINUTE));
                System.out.println("Seconds: " + calendar.get(Calendar.SECOND));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

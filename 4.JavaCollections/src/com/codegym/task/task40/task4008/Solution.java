package com.codegym.task.task40.task4008;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d.M.y H:m:s");
        if (date.contains(".") && !date.contains(":")) {
            dateFormat = DateTimeFormatter.ofPattern("d.M.y");
            printTime = false;
        }
        if (date.contains(":") && !date.contains(".")) {
            dateFormat = DateTimeFormatter.ofPattern("H:m:s");
            printDate = false;
        }

        if (printDate) {
            LocalDate localDate = LocalDate.parse(date, dateFormat);
            System.out.println("Day: " + localDate.getDayOfMonth());
            System.out.println("Day of the week: " + localDate.getDayOfWeek().getValue());
            System.out.println("Day of the month: " + localDate.getDayOfMonth());
            System.out.println("Day of the year: " + localDate.getDayOfYear());
            System.out.println("Week of the month: " + localDate.format(DateTimeFormatter.ofPattern("W")));
            System.out.println("Week of the year: " + localDate.format(DateTimeFormatter.ofPattern("w")));
            System.out.println("Month: " + localDate.getMonth().getValue());
            System.out.println("Year: " + localDate.getYear());
        }
        if (printTime) {
            LocalTime localTime = LocalTime.parse(date, dateFormat);
            System.out.println("AM or PM: " + localTime.format(DateTimeFormatter.ofPattern("a")));
            System.out.println("Hour: " + localTime.format(DateTimeFormatter.ofPattern("K")));
            System.out.println("Hour of the day: " + localTime.getHour());
            System.out.println("Minutes: " + localTime.getMinute());
            System.out.println("Seconds: " + localTime.getSecond());
        }
    }
}

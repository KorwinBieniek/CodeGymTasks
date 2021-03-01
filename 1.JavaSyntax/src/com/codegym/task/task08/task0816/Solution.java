package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Kind Emma and the summer holidays

*/

public class Solution {
    static class debug{ //True is debug mode, false normal mode
        static public boolean flag(){
            return false;  //Set false before verifying
        }
    }
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Stallone1", df.parse("JUNE 1 1980"));
        map.put("Stallone2", df.parse("AUGUST 1 1980"));
        map.put("Stallone3", df.parse("APRIL 1 1980"));
        map.put("Stallone4", df.parse("MARCH 1 1980"));
        map.put("Stallone5", df.parse("JUNE 1 1980"));
        map.put("Stallone6", df.parse("FEBRUARY 1 1980"));
        map.put("Stallone7", df.parse("JUNE 1 1980"));
        map.put("Stallone8", df.parse("AUGUST 1 1980"));
        map.put("Stallone9", df.parse("JUNE 1 1980"));
        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        HashMap<String, Date> copyMap = new HashMap<>(map);
        for (Map.Entry<String, Date> pair : copyMap.entrySet()) {
            String value = pair.getValue().toString();
            if (value.contains("Jun") || value.contains("Aug") || value.contains("Jul")) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) throws ParseException {
//        if (debug.flag()) {
//            HashMap<String, Date> map = new HashMap<>(createMap());
//            removeAllSummerPeople(map);
//            for (Map.Entry<String, Date> pair : map.entrySet()) {
//                System.out.println("Name: " + pair.getKey() + " Date: " + pair.getValue());
//            }
//        }

    }
}

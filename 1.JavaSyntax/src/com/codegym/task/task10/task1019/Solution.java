package com.codegym.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Functionality is not enough!

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        String number;

        while(true)
        {
            number = reader.readLine();
            if(number.isEmpty())
                break;

            int id = Integer.parseInt(number);
            String name = reader.readLine();
            map.put(name, id);
        }




        for(Map.Entry<String, Integer> pair : map.entrySet())
        {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }


    }
}

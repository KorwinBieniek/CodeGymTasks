package com.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //write your code here
        HashMap<String,Integer> map = new HashMap<>();

        map.put("L",100);
        map.put("gdsL",700);
        map.put("gdsgsL",900);
        map.put("Lvc",900);
        map.put("xzL",9000);
        map.put("Lbccc",100);
        map.put("gfdsL",200);
        map.put("Lwqe",500);
        map.put("Lttt",100);
        map.put("Ltsstt",100);

        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //write your code here
        HashMap<String,Integer> copy = new HashMap<>(map);

        for(Map.Entry<String,Integer> values : copy.entrySet())
        {
            if(values.getValue() < 500) map.remove(values.getKey());
        }

        map = copy;
    }

    public static void main(String[] args) {

    }
}
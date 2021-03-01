package com.codegym.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
We don't need repeats

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here

        HashMap<String,String> map = new HashMap<String,String>();
        map.put("A","B");
        map.put("K","F");
        map.put("M","B");
        map.put("J","FD");
        map.put("H","B");
        map.put("n","HFSDH");
        map.put("D","B");
        map.put("C","DS");
        map.put("V","G");
        map.put("Z","DS");

        return map;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        //write your code here

        HashMap<String, String> copy = new HashMap<>(map);
        //HashMap<String, String> copy1 = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            int count = 0;
            String Value = pair.getValue();
            for(Map.Entry<String, String> pair2 : copy.entrySet()) {
                if (pair2.getValue().equals(Value)) {
                    count++;
                    if (count > 1){

                        removeItemFromMapByValue(map, Value);
                        break;
                    }
                }
            }
        }

        //map = copy1;

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}

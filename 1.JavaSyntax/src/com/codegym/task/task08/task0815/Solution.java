package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here
        HashMap<String,String> map = new HashMap<>();

        map.put("abb","b");
        map.put("baa","ee");
        map.put("ew","we");
        map.put("ret","b");
        map.put("po","dr");
        map.put("yr","ee");
        map.put("ii","baea");
        map.put("soo","op");
        map.put("beaa","dr");
        map.put("iil","ss");

        return map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        //write your code here
        int fcount = 0;
        for(HashMap.Entry<String,String> pair : map.entrySet())
        {
            if(name.contains(pair.getValue()))
                fcount++;
        }
        return fcount;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        //write your code here
        int lcount = 0;
        for(HashMap.Entry<String,String> pair : map.entrySet())
        {
            if(lastName.contains(pair.getKey()))
                lcount++;
        }
        return lcount;

    }

    public static void main(String[] args) {

    }
}

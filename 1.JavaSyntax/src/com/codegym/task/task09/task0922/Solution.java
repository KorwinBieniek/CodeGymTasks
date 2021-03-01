package com.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
What's today's date?

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String date = br.readLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd",Locale.ENGLISH);
        Date date1 = sdf.parse(date);

        SimpleDateFormat sdf2 = new SimpleDateFormat("MMM dd, yyyy",Locale.ENGLISH);
        System.out.println(sdf2.format(date1).toUpperCase());

    }
}

package com.codegym.task.task14.task1420;

/* 
GCD

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);


            int a = Integer.parseInt(input.next());
            int b = Integer.parseInt(input.next());
            if(a < 1 || b < 1){
                throw new IllegalArgumentException();
            }else
            System.out.println(gcdByEuclidsAlgorithm(a,b));


    }

    static int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
}

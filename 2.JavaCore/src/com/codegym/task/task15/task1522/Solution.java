package com.codegym.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Reinforce the singleton pattern

*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    // Add static block here
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // Implement step #5 here
        Scanner input = new Scanner(System.in);
        String planet = input.next();

        if (planet.equals(Planet.EARTH)) {
            thePlanet = Earth.getInstance();
        } else if (planet.equals(Planet.SUN)) {
            thePlanet = Sun.getInstance();
        } else if (planet.equals(Planet.MOON)) {
            thePlanet = Moon.getInstance();
        } else {
            thePlanet = null;
        }

    }
}

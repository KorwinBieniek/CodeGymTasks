package com.codegym.task.task14.task1408;

/* 
Chicken factory

*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        hen.getMonthlyEggCount();
    }

    static class HenFactory {

        static Hen getHen(String continent) {
            Hen hen = null;
            switch(continent){
                case "North America":
                    hen = new NorthAmericanHen();
                    break;
                case "Africa":
                    hen = new AfricanHen();
                    break;
                case "Asia":
                    hen = new AsianHen();
                break;
                case "Europe":
                    hen = new EuropeanHen();
                break;
            }
            return hen;
        }
    }



}

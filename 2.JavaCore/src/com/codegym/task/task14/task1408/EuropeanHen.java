package com.codegym.task.task14.task1408;

class EuropeanHen extends Hen {

    @Override
    int getMonthlyEggCount() {
        return 6;
    }

    String getDescription(){
        return super.getDescription() +  " I come from " + Continent.EUROPE + ". I lay " + getMonthlyEggCount() + " eggs a month.";
    }
}

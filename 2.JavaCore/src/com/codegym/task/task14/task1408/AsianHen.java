package com.codegym.task.task14.task1408;

class AsianHen extends Hen {

    @Override
    int getMonthlyEggCount() {
        return 4;
    }

    String getDescription(){
        return super.getDescription() +  " I come from " + Continent.ASIA + ". I lay " + getMonthlyEggCount() + " eggs a month.";
    }
}

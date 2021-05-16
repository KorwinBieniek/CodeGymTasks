package com.codegym.task.task27.task2712.statistics;

import com.codegym.task.task27.task2712.statistics.event.EventDataRow;

public class StatisticsManager {
    public void record(EventDataRow data) {

    }

    private StatisticsManager() {
    }

    public static StatisticsManager getInstance() {
        return InstanceHolder.statisticsManager;
    }

    private static class InstanceHolder {
        private static StatisticsManager statisticsManager = new StatisticsManager();
    }
}

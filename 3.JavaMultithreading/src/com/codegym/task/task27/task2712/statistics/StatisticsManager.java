package com.codegym.task.task27.task2712.statistics;

import com.codegym.task.task27.task2712.statistics.event.EventDataRow;
import com.codegym.task.task27.task2712.statistics.event.EventType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StatisticsManager {
    private static StatisticsManager ourInstance = new StatisticsManager();

    public static StatisticsManager getInstance() {
        return ourInstance;
    }

    private StatisticsStorage statisticsStorage = new StatisticsStorage();

    private StatisticsManager() {
    }

    public void record(EventDataRow data) {
    }

    private class StatisticsStorage {
        private Map<EventType, List<EventDataRow>> storage = new HashMap<>();

        private StatisticsStorage() {
            for (EventType type : EventType.values()) {
                this.storage.put(type, new ArrayList<EventDataRow>());
            }
        }
    }
}

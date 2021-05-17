package com.codegym.task.task27.task2712.statistics;

import com.codegym.task.task27.task2712.kitchen.Cook;
import com.codegym.task.task27.task2712.statistics.event.EventDataRow;
import com.codegym.task.task27.task2712.statistics.event.EventType;

import java.util.*;

public class StatisticsManager {
    private static StatisticsManager ourInstance = new StatisticsManager();

    public static StatisticsManager getInstance() {
        return ourInstance;
    }

    private StatisticsStorage statisticsStorage = new StatisticsStorage();
    private Set<Cook> cooks = new HashSet<>();

    private StatisticsManager() {
    }

    private class StatisticsStorage {
        private Map<EventType, List<EventDataRow>> storage = new HashMap<>();

        private StatisticsStorage() {
            for (EventType type : EventType.values()) {
                this.storage.put(type, new ArrayList<EventDataRow>());
            }
        }

        private void put(EventDataRow data) {
            EventType type = data.getType();
            if (!this.storage.containsKey(type))
                throw new UnsupportedOperationException();

            this.storage.get(type).add(data);
        }

        private List<EventDataRow> get(EventType type) {
            return null;
        }
    }

    public void record(EventDataRow data) {
        this.statisticsStorage.put(data);
    }

    public void register(Cook cook) {
        this.cooks.add(cook);
    }

    public Map<String, Long> getProfitMap() {
        return null;
    }

    public Map<String, Map<String, Integer>> getCookWorkloadingMap() {
        return null;
    }
}

package com.codegym.task.task27.task2712.statistics;

import com.codegym.task.task27.task2712.kitchen.Cook;
import com.codegym.task.task27.task2712.statistics.event.OrderReadyEventDataRow;
import com.codegym.task.task27.task2712.statistics.event.EventDataRow;
import com.codegym.task.task27.task2712.statistics.event.EventType;
import com.codegym.task.task27.task2712.statistics.event.VideosSelectedEventDataRow;

import java.text.SimpleDateFormat;
import java.util.*;

public class StatisticsManager {
    private static StatisticsManager ourInstance = new StatisticsManager();

    public static StatisticsManager getInstance() {
        return ourInstance;
    }

    private StatisticsStorage statisticsStorage = new StatisticsStorage();

    public Set<Cook> getCooks() {
        return cooks;
    }

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
            if (!this.storage.containsKey(type))
                throw new UnsupportedOperationException();

            return this.storage.get(type);
        }
    }

    public void record(EventDataRow data) {
        this.statisticsStorage.put(data);
    }

    public void register(Cook cook) {
        this.cooks.add(cook);
    }

    public Map<String, Long> getProfitMap() {
        Map<String, Long> res = new HashMap();
        List<EventDataRow> rows = statisticsStorage.get(EventType.VIDEOS_SELECTED);
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        long total = 0l;
        for (EventDataRow row : rows) {
            VideosSelectedEventDataRow dataRow = (VideosSelectedEventDataRow) row;
            String date = format.format(dataRow.getDate());
            if (!res.containsKey(date)) {
                res.put(date, 0l);
            }
            total += dataRow.getAmount();
            res.put(date, res.get(date) + dataRow.getAmount());
        }

        res.put("Total", total);

        return res;
    }

    public Map<String, Map<String, Integer>> getCookWorkloadingMap() {
        Map<String, Map<String, Integer>> res = new HashMap(); //name, time
        List<EventDataRow> rows = statisticsStorage.get(EventType.ORDER_READY);
        SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        for (EventDataRow row : rows) {
            OrderReadyEventDataRow dataRow = (OrderReadyEventDataRow) row;
            String date = format.format(dataRow.getDate());
            if (!res.containsKey(date)) {
                res.put(date, new HashMap<String, Integer>());
            }
            Map<String, Integer> cookMap = res.get(date);
            String cookName = dataRow.getCookName();
            if (!cookMap.containsKey(cookName)) {
                cookMap.put(cookName, 0);
            }

            Integer totalTime = cookMap.get(cookName);
            cookMap.put(cookName, totalTime + dataRow.getTime());
        }

        return res;
    }
}

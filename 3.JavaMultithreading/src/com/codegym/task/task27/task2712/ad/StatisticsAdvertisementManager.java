package com.codegym.task.task27.task2712.ad;

import java.util.ArrayList;
import java.util.List;

public class StatisticsAdvertisementManager {
    private static StatisticsAdvertisementManager ourInstance = new StatisticsAdvertisementManager();
    private AdvertisementStorage storage = AdvertisementStorage.getInstance();

    public static StatisticsAdvertisementManager getInstance() {
        return ourInstance;
    }

    private StatisticsAdvertisementManager() {
    }

    public List<Advertisement> getVideoSet(boolean isActive) {
        List<Advertisement> result = new ArrayList<>();
        for (Advertisement advertisement : storage.list()) {
            if (!isActive ^ advertisement.isActive()) {
                result.add(advertisement);
            }
        }
        return result;
    }
}

package com.codegym.task.task27.task2712.statistics.event;


import com.codegym.task.task27.task2712.ad.Advertisement;

import java.util.Date;
import java.util.List;

public class VideosSelectedEventDataRow implements EventDataRow {
    private long amount;
    private List<Advertisement> optimalVideoSet;
    private int totalDuration;
    private Date currentDate;

    public VideosSelectedEventDataRow(List<Advertisement> optimalVideoSet, long amount, int totalDuration) {
        this.amount = amount;
        this.optimalVideoSet = optimalVideoSet;
        this.totalDuration = totalDuration;
        this.currentDate = new Date();
    }
}

package com.codegym.task.task27.task2712.statistics.event;

import java.util.Date;

public class NoVideosAvailableEventDataRow implements EventDataRow {
    private int totalDuration;
    private Date currentDate;

    public NoVideosAvailableEventDataRow(int totalDuration) {
        this.totalDuration = totalDuration;
        this.currentDate = new Date();
    }
}

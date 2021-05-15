package com.codegym.task.task27.task2712.ad;

public class Advertisement {
    // the video
    private Object content;

    private String name;

    // The amount paid for ads in cents. Use a long to avoid rounding problems
    private long amountPaid;

    // The number of impressions that have been paid for but not shown
    private int impressionsRemaining;

    // The duration in seconds
    private int duration;

    public Advertisement(Object content, String name, long amountPaid, int impressionsRemaining, int duration) {
        this.content = content;
        this.name = name;
        this.amountPaid = amountPaid;
        this.impressionsRemaining = impressionsRemaining;
        this.duration = duration;
    }
}

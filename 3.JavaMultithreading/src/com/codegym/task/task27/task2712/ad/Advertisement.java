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

    private long amountPerImpression;

    public Advertisement(Object content, String name, long amountPaid, int impressionsRemaining, int duration) {
        this.content = content;
        this.name = name;
        this.amountPaid = amountPaid;
        this.impressionsRemaining = impressionsRemaining;
        this.duration = duration;

        if (impressionsRemaining > 0) {
            amountPerImpression = amountPaid / impressionsRemaining;
        }
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public long getAmountPerImpression() {
        return amountPerImpression;
    }

    public void revalidate() {
        if (impressionsRemaining == 0) {
            throw new UnsupportedOperationException();
        }
        impressionsRemaining--;
    }

    public boolean isActive() {
        return impressionsRemaining > 0;
    }
}

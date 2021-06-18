package com.codegym.task.task28.task2810.model;

import com.codegym.task.task28.task2810.vo.JobPosting;

import java.util.ArrayList;
import java.util.List;

public class LinkedinStrategy implements Strategy {

    private static final String URL_FORMAT = "https://www.linkedin.com/jobs/search?keywords=java+%s&start=%d";

    @Override
    public List<JobPosting> getJobPostings(String searchString) {
        return new ArrayList<>();
    }
}

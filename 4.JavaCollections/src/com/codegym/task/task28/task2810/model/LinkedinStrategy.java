package com.codegym.task.task28.task2810.model;

import com.codegym.task.task28.task2810.vo.JobPosting;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LinkedinStrategy implements Strategy {

    private static final String URL_FORMAT = "https://www.linkedin.com/jobs/search?keywords=java+%s&start=%d";

    @Override
    public List<JobPosting> getJobPostings(String searchString) {
        try {
            Document document = Jsoup.connect(String.format(URL_FORMAT, "MyTown", 0))
                    .userAgent("Mozilla/5.0 (jsoup)")
                    .referrer("https://www.linkedin.com/")
                    .get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}

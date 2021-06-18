package com.codegym.task.task28.task2810.view;

import com.codegym.task.task28.task2810.Controller;
import com.codegym.task.task28.task2810.vo.JobPosting;

import java.util.List;

public class HtmlView implements View {

    private final String filePath = "./4.JavaCollections/src/" + this.getClass().getPackage().getName().replaceAll("[.]", "/") + "/jobPostings.html";

    private Controller controller;

    @Override
    public void update(List<JobPosting> vacancies) {
        try {
            String newContent = getUpdatedFileContents(vacancies);
            updateFile(newContent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void emulateCitySelection() {
        controller.onCitySelected("San Francisco");
    }

    private String getUpdatedFileContents(List<JobPosting> vacancies) {
        return null;
    }

    private void updateFile(String content) {

    }
}

package com.codegym.task.task28.task2810.view;

import com.codegym.task.task28.task2810.Controller;
import com.codegym.task.task28.task2810.vo.JobPosting;

import java.util.List;

public class HtmlView implements View {

    private Controller controller;

    @Override
    public void update(List<JobPosting> vacancies) {
        System.out.println(vacancies.size());
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void emulateCitySelection() {
        controller.onCitySelected("Odessa");
    }
}

package com.codegym.task.task28.task2810;


import com.codegym.task.task28.task2810.model.LinkedinStrategy;
import com.codegym.task.task28.task2810.model.Model;
import com.codegym.task.task28.task2810.model.Provider;
import com.codegym.task.task28.task2810.view.HtmlView;

public class Aggregator {

    public static void main(String[] args) {
        HtmlView view = new HtmlView();
        Model model = new Model(view, new Provider(new LinkedinStrategy()));
        Controller controller = new Controller(model);

        view.setController(controller);

        view.emulateCitySelection();
    }
}

package com.codegym.task.task36.task3608.controller;

import com.codegym.task.task36.task3608.model.Model;

public class Controller {
    //controller cannot contain business logic, only operate with views

    private Model model;

    public void setModel(Model model) {
        this.model = model;
    }

    public void onShowAllUsers() {
        model.loadUsers();
    }
}
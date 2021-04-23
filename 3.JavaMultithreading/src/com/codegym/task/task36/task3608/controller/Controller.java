package com.codegym.task.task36.task3608.controller;

import com.codegym.task.task36.task3608.model.Model;
import com.codegym.task.task36.task3608.view.UsersView;

public class Controller {
    //controller cannot contain business logic, only operate with views

    private Model model;
    private UsersView usersView;

    public void setModel(Model model) {
        this.model = model;
    }

    public void setUsersView(UsersView usersView) {
        this.usersView = usersView;
    }

    public void onShowAllUsers() {
        model.loadUsers();
        usersView.refresh(model.getDataModel());
    }

    public void onShowAllDeletedUsers() {
        model.loadDeletedUsers();
        usersView.refresh(model.getDataModel());
    }
}
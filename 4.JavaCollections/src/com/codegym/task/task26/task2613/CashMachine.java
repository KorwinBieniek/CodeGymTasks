package com.codegym.task.task26.task2613;

import com.codegym.task.task26.task2613.command.CommandExecutor;

import java.util.Locale;

public class CashMachine {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Operation operation;
        do {
            operation = ConsoleHelper.requestOperation();
            CommandExecutor.execute(operation);
        } while (operation != Operation.EXIT);
    }
}

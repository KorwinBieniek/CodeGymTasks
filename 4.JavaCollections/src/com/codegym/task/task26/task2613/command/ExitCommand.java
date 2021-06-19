package com.codegym.task.task26.task2613.command;


import com.codegym.task.task26.task2613.ConsoleHelper;
import com.codegym.task.task26.task2613.exception.InterruptedOperationException;

class ExitCommand implements Command {

    @Override
    public void execute() throws InterruptedOperationException {
        ConsoleHelper.writeMessage("Do you want to exit? <y,n>");
        String result = ConsoleHelper.readString();
        if (result != null && "y".equals(result.toLowerCase())) {
            ConsoleHelper.writeMessage("Thank you for visiting the CodeGym ATM.");
        } else {
            //TODO process NO
        }
    }
}

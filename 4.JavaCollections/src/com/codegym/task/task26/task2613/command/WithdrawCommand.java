package com.codegym.task.task26.task2613.command;


import com.codegym.task.task26.task2613.ConsoleHelper;
import com.codegym.task.task26.task2613.CurrencyManipulator;
import com.codegym.task.task26.task2613.CurrencyManipulatorFactory;
import com.codegym.task.task26.task2613.exception.InterruptedOperationException;
import com.codegym.task.task26.task2613.exception.InsufficientFundsException;

import java.util.Map;

class WithdrawCommand implements Command {

    @Override
    public void execute() throws InterruptedOperationException {
        ConsoleHelper.writeMessage("Withdrawing...");

        String currencyCode = ConsoleHelper.requestCurrencyCode();
        CurrencyManipulator manipulator = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);

        while (true) {
            try {
                ConsoleHelper.writeMessage("Please enter an integer amount to withdraw.");
                String s = ConsoleHelper.readString();
                if (s == null) {
                    ConsoleHelper.writeMessage("Please enter a valid positive integer amount to withdraw.");
                } else {
                    try {
                        int amount = Integer.parseInt(s);
                        boolean isAmountAvailable = manipulator.isAmountAvailable(amount);
                        if (isAmountAvailable) {
                            Map<Integer, Integer> denominations = manipulator.withdrawAmount(amount);
                            for (Integer item : denominations.keySet()) {
                                ConsoleHelper.writeMessage("\t" + item + " - " + denominations.get(item));
                            }

                            ConsoleHelper.writeMessage(String.format("%d %s has been withdrawn.", amount, currencyCode));
                            break;
                        } else {
                            ConsoleHelper.writeMessage("There are insufficient funds in your account. Please try again.");
                        }
                    } catch (NumberFormatException e) {
                        ConsoleHelper.writeMessage("Please enter a valid positive integer amount to withdraw.");
                    }
                }
            } catch (InsufficientFundsException e) {
                ConsoleHelper.writeMessage("The exact amount is not available.");
            }
        }
    }
}

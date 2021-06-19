package com.codegym.task.task26.task2613.command;


import com.codegym.task.task26.task2613.ConsoleHelper;
import com.codegym.task.task26.task2613.exception.InterruptedOperationException;

class LoginCommand implements Command {
    private String validCreditCard = "123456789012";
    private String validPin = "1234";

    @Override
    public void execute() throws InterruptedOperationException {
        ConsoleHelper.writeMessage("Logging in...");

        while (true) {
            ConsoleHelper.writeMessage("Please enter your credit card number and PIN code, or type 'EXIT' to exit.");
            String creditCardNumber = ConsoleHelper.readString();
            String pinStr = ConsoleHelper.readString();
            if (creditCardNumber == null || (creditCardNumber = creditCardNumber.trim()).length() != 12 ||
                    pinStr == null || (pinStr = pinStr.trim()).length() != 4) {
                ConsoleHelper.writeMessage("Please enter a valid credit card number (12 digits) or PIN code (4 digits).");
            } else {
                try {
                    if (creditCardNumber.equals(validCreditCard) && pinStr.equals(validPin)) {
                        ConsoleHelper.writeMessage(String.format("Credit card [%s] is verified successfully!", creditCardNumber));
                        break;
                    } else {
                        ConsoleHelper.writeMessage(String.format("Credit card [%s] has not been verified.", creditCardNumber));
                        ConsoleHelper.writeMessage("Please try again or type 'EXIT' to exit immediately.");
                    }
                } catch (NumberFormatException e) {
                    ConsoleHelper.writeMessage("Please enter a valid credit card number (12 digits) or PIN code (4 digits).");
                }
            }
        }

    }
}

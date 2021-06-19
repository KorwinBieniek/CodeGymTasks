package com.codegym.task.task26.task2613;

import java.util.Locale;

public class CashMachine {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        String currencyCode = ConsoleHelper.requestCurrencyCode();

        String[] digits = ConsoleHelper.getTwoValidNumbers(currencyCode);
        int denomination = Integer.parseInt(digits[0]);
        int count = Integer.parseInt(digits[1]);

        CurrencyManipulator manipulatorByCurrencyCode = CurrencyManipulatorFactory.getManipulatorByCurrencyCode(currencyCode);
        manipulatorByCurrencyCode.addAmount(denomination, count);
    }
}

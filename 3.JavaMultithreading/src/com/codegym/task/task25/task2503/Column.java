package com.codegym.task.task25.task2503;

import java.util.LinkedList;
import java.util.List;

public enum Column implements Columnable {
    Customer("Customer"),
    BankName("Bank Name"),
    AccountNumber("Account Number"),
    Amount("Available Amount");

    private String columnName;

    private static int[] realOrder;

    Column(String columnName) {
        this.columnName = columnName;
    }

    /**
     * Specifies a new column display order, which is saved in the realOrder array.
     * realOrder[enum index] = display order; -1, if the column is not displayed.
     *
     * @param newOrder new order for displaying the columns in the table
     * @throws IllegalArgumentException if a column is repeated
     */
    public static void configureColumns(Column... newOrder) {
        realOrder = new int[values().length];
        for (Column column : values()) {
            realOrder[column.ordinal()] = -1;
            boolean isFound = false;

            for (int i = 0; i < newOrder.length; i++) {
                if (column == newOrder[i]) {
                    if (isFound) {
                        throw new IllegalArgumentException("Column '" + column.columnName + "' is already configured.");
                    }
                    realOrder[column.ordinal()] = i;
                    isFound = true;
                }
            }
        }
    }

    /**
     * Calculates and returns the list of columns to display in a configurable order (see the configureColumns method)
     * Uses the realOrder.
     *
     * @return list of columns
     */
    public static List<Column> getVisibleColumns() {
        List<Column> result = new LinkedList<>();
        int nextIndex = 0;
        boolean hasNextElement = true;
        while (hasNextElement) {
            hasNextElement = false;
            for (int i = 0; i < realOrder.length; i++) {
                if (realOrder[i] == nextIndex) {
                    result.add(values()[i]);
                    break;
                }
            }
            for (int aRealOrder : realOrder) {
                if (aRealOrder == nextIndex + 1) {
                    hasNextElement = true;
                    nextIndex++;
                    break;
                }
            }
        }
        return result;
    }


    @Override
    public String getColumnName() {
        return columnName;
    }

    @Override
    public boolean isShown() {
        return realOrder != null && realOrder[ordinal()] != -1;
    }

    @Override
    public void hide() {
        int oldOrder = realOrder[ordinal()];
        if (oldOrder == -1) return; //already hidden
        realOrder[ordinal()] = -1;
        //reorder
        for (int i = 0; i < realOrder.length; i++) {
            int currentIndex = realOrder[i];
            if (currentIndex != -1 && currentIndex > oldOrder) {
                realOrder[i] -= 1;
            }
        }
    }
}

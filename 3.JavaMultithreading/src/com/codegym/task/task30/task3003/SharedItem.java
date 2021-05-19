package com.codegym.task.task30.task3003;

//This class shows how to call other constructors using 'this'
public class SharedItem {
    public String description;
    public int itemId;

    public SharedItem() {
        this("Test Item", 0);
    }

    public SharedItem(String description) {
        this(description, 0);
    }

    public SharedItem(int itemId) {
        this("Test Item", itemId);
    }

    public SharedItem(String description, int itemId) {
        this.description = description;
        this.itemId = itemId;
    }

    public String getDescription() {
        return description;
    }

    public int getItemId() {
        return itemId;
    }

    @Override
    public String toString() {
        return "SharedItem{" +
                "description='" + description + '\'' +
                ", itemId=" + itemId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SharedItem)) return false;

        SharedItem sharedItem = (SharedItem) o;

        if (itemId != sharedItem.itemId) return false;
        if (description != null ? !description.equals(sharedItem.description) : sharedItem.description != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = description != null ? description.hashCode() : 0;
        result = 31 * result + itemId;
        return result;
    }
}

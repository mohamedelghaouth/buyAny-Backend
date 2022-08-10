package com.dellahi.buyAny.Model;

public class CommandItems {

    private int commandNumber;
    private int itemID;
    private int quantity;

    public CommandItems(int commandNumber, int itemID, int quantity) {
        this.commandNumber = commandNumber;
        this.itemID = itemID;
        this.quantity = quantity;
    }

    public int getCommandNumber() {
        return commandNumber;
    }

    public void setCommandNumber(int commandNumber) {
        this.commandNumber = commandNumber;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CommandItems{" +
                "commandNumber=" + commandNumber +
                ", itemID=" + itemID +
                ", quantity=" + quantity +
                '}';
    }
}

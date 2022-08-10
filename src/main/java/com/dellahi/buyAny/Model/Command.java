package com.dellahi.buyAny.Model;

public class Command {

    private int commandNumber;
    private String status;
    private int total;

    public Command(int commandNumber, int total) {
        this.commandNumber = commandNumber;
        this.total = total;
    }

    public int getCommandNumber() {
        return commandNumber;
    }

    public void setCommandNumber(int commandNumber) {
        this.commandNumber = commandNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Command{" +
                "commandNumber=" + commandNumber +
                ", status='" + status + '\'' +
                ", total=" + total +
                '}';
    }
}

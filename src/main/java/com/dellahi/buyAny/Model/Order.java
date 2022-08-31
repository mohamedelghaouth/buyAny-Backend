package com.dellahi.buyAny.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "orders")
public class Order {

    @Id
    @Column(name = "order_number")
    private Long orderNumber;

    @Column(name = "status")
    private String status;

    @Column(name = "total")
    private int total;

    public Order(Long orderNumber, int total) {
        this.orderNumber = orderNumber;
        this.total = total;
    }

    public Order() {
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
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
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", status='" + status + '\'' +
                ", total=" + total +
                '}';
    }
}

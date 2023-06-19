package com.dellahi.buyAny.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "orders")
public class Order {

    @Id
    @Column(name = "order_number")
    private Long orderNumber;

    @Column(name = "status")
    private String status;

    @Column(name = "total")
    private int total;
}

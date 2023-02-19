package com.dellahi.buyAny.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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

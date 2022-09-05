package com.dellahi.buyAny.Model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {

    @Id
    @Column(name = "order_number")
    private Long orderNumber;

    @Column(name = "status")
    private String status;

    @Column(name = "total")
    private int total;
}

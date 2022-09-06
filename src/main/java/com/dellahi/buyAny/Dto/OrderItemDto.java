package com.dellahi.buyAny.Dto;

import lombok.Data;

@Data
public class OrderItemDto {

    private Long order;
    private String item;
    private int quantity;
    private int totalPrice;

}

package com.dellahi.buyAny.Dto;

import lombok.Data;

@Data
public class OrderDto {

    private Long orderNumber;
    private String status;
    private int total;

}
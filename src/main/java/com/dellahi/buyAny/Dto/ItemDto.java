package com.dellahi.buyAny.Dto;

import lombok.Data;

@Data
public class ItemDto {

    private String itemName;
    private String itemDescription;
    private int price;
    private String category;
}
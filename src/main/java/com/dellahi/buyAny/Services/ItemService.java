package com.dellahi.buyAny.Services;

import com.dellahi.buyAny.Model.Item;

import java.util.List;

public interface ItemService {
    Item saveItem(Item item);
    Item updateItem(Item item);
    void deleteItem(Item item);
    void deleteItemById(Long id);
    Item getItem(Long id);
    List<Item> getAllItems();
}
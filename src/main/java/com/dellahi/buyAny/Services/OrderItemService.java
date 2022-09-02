package com.dellahi.buyAny.Services;

import com.dellahi.buyAny.Model.OrderItem;

import java.util.List;

public interface OrderItemService {

    OrderItem saveOrderItem(OrderItem orderItem);
    OrderItem updateOrderItem(OrderItem orderItem);
    void deleteOrderItem(OrderItem orderItem);
    void deleteOderItemById(Long id);
    OrderItem getOrderItemById(Long id);
    List<OrderItem> getAllOrderItems();
}

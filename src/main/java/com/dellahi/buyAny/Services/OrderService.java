package com.dellahi.buyAny.Services;

import com.dellahi.buyAny.Model.Order;

import java.util.List;

public interface OrderService {
    Order saveOrder(Order order);
    Order updateOrder(Order order);
    void deleteOrder(Order order);
    void deleteOrderByOrderNumber(Long orderNumber);
    Order getOrderByOrderNumber(Long orderNumber);
    List<Order> getAllOrders();

}

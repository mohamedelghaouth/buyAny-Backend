package com.dellahi.buyAny.Services.Impl;

import com.dellahi.buyAny.Model.Order;
import com.dellahi.buyAny.Repository.OrderRepository;
import com.dellahi.buyAny.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public Order updateOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public void deleteOrder(Order order) {
        orderRepository.delete(order);
    }

    @Override
    public void deleteOrderByOrderNumber(Long orderNumber) {
        orderRepository.deleteById(orderNumber);
    }

    @Override
    public Order getOrderByOrderNumber(Long orderNumber) {
        return orderRepository.findById(orderNumber).get();
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}

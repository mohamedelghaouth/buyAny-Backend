package com.dellahi.buyAny.Repository;

import com.dellahi.buyAny.Model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}

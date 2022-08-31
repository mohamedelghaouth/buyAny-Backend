package com.dellahi.buyAny.Repository;

import com.dellahi.buyAny.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}

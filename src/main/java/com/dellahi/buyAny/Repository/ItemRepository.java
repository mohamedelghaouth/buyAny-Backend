package com.dellahi.buyAny.Repository;

import com.dellahi.buyAny.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}

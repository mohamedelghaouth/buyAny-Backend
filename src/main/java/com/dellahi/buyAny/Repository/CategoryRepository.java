package com.dellahi.buyAny.Repository;

import com.dellahi.buyAny.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,String> {
}
